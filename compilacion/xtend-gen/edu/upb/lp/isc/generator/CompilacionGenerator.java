/**
 * generated by Xtext 2.24.0
 */
package edu.upb.lp.isc.generator;

import edu.upb.lp.isc.compilacion.Aritmetica;
import edu.upb.lp.isc.compilacion.Bloque;
import edu.upb.lp.isc.compilacion.Bool;
import edu.upb.lp.isc.compilacion.DataType_;
import edu.upb.lp.isc.compilacion.Declaraciones;
import edu.upb.lp.isc.compilacion.Ejecucion;
import edu.upb.lp.isc.compilacion.Equal;
import edu.upb.lp.isc.compilacion.Estructuras;
import edu.upb.lp.isc.compilacion.Expr;
import edu.upb.lp.isc.compilacion.FuncionSimplificada;
import edu.upb.lp.isc.compilacion.List;
import edu.upb.lp.isc.compilacion.MyInt;
import edu.upb.lp.isc.compilacion.MyString;
import edu.upb.lp.isc.compilacion.Operadores;
import edu.upb.lp.isc.compilacion.Programa;
import edu.upb.lp.isc.compilacion.Simple;
import edu.upb.lp.isc.compilacion.Variables;
import java.util.LinkedList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CompilacionGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final Programa a = ((Programa) _head);
    String _name = a.getName();
    String _plus = (_name + ".cpp");
    fsa.generateFile(_plus, this.generatePrograma(a));
  }
  
  public CharSequence generatePrograma(final Programa a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <bits/stdc++.h>");
    _builder.newLine();
    _builder.append("using namespace std;");
    _builder.newLine();
    _builder.append("int main()");
    _builder.newLine();
    _builder.append("{\t    ");
    _builder.newLine();
    {
      EList<Declaraciones> _declaraciones = a.getDeclaraciones();
      for(final Declaraciones d : _declaraciones) {
        CharSequence _generateDeclaraciones = this.generateDeclaraciones(d);
        _builder.append(_generateDeclaraciones);
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Ejecucion> _ejecuciones = a.getEjecuciones();
      for(final Ejecucion e : _ejecuciones) {
        CharSequence _generateEjecucion = this.generateEjecucion(e);
        _builder.append(_generateEjecucion);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateEjecucion(final Ejecucion e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof Expr)) {
        _builder.append("cout<<");
        CharSequence _generateExpr = this.generateExpr(((Expr) e));
        _builder.append(_generateExpr);
        _builder.append("<<endl;");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateDeclaraciones(final Declaraciones d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((d instanceof Simple)) {
        CharSequence _generateSimple = this.generateSimple(((Simple) d));
        _builder.append(_generateSimple);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence generateSimple(final Simple s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((s instanceof Expr)) {
        CharSequence _generateExpr = this.generateExpr(((Expr) s));
        _builder.append(_generateExpr);
        _builder.newLineIfNotEmpty();
      } else {
        if ((s instanceof Estructuras)) {
          CharSequence _generateEstructuras = this.generateEstructuras(((Estructuras) s));
          _builder.append(_generateEstructuras);
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateExpr(final Expr e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((e instanceof DataType_)) {
        CharSequence _generateDataType = this.generateDataType(((DataType_) e));
        _builder.append(_generateDataType);
        _builder.newLineIfNotEmpty();
      } else {
        if ((e instanceof Aritmetica)) {
          CharSequence _generateAritmetica = this.generateAritmetica(((Aritmetica) e));
          _builder.append(_generateAritmetica);
          _builder.newLineIfNotEmpty();
        } else {
          if ((e instanceof Equal)) {
            CharSequence _generateEqual = this.generateEqual(((Equal) e));
            _builder.append(_generateEqual);
            _builder.newLineIfNotEmpty();
          } else {
            if ((e instanceof Variables)) {
              CharSequence _generateVariables = this.generateVariables(((Variables) e));
              _builder.append(_generateVariables);
              _builder.newLineIfNotEmpty();
            } else {
              if ((e instanceof FuncionSimplificada)) {
                CharSequence _generateFuncionSimplificada = this.generateFuncionSimplificada(((FuncionSimplificada) e));
                _builder.append(_generateFuncionSimplificada);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence generateDataType(final DataType_ d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((d instanceof MyInt)) {
        final MyInt data = ((MyInt) d);
        _builder.newLineIfNotEmpty();
        int _value = data.getValue();
        _builder.append(_value);
        _builder.newLineIfNotEmpty();
      } else {
        if ((d instanceof MyString)) {
          final MyString data_1 = ((MyString) d);
          _builder.newLineIfNotEmpty();
          _builder.append("\"");
          String _value_1 = data_1.getValue();
          _builder.append(_value_1);
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
        } else {
          if ((d instanceof Bool)) {
            final Bool data_2 = ((Bool) d);
            _builder.newLineIfNotEmpty();
            String _op = data_2.getOp();
            _builder.append(_op);
            _builder.newLineIfNotEmpty();
          } else {
            if ((d instanceof List)) {
              final List data_3 = ((List) d);
              _builder.newLineIfNotEmpty();
              _builder.append("\'[\'");
              _builder.newLine();
              LinkedList<Object> l = CollectionLiterals.<Object>newLinkedList();
              _builder.newLineIfNotEmpty();
              {
                EList<DataType_> _typeOfList = data_3.getTypeOfList();
                for(final DataType_ i : _typeOfList) {
                  String _xblockexpression = null;
                  {
                    l.add(this.generateDataType(i));
                    _xblockexpression = "";
                  }
                  _builder.append(_xblockexpression);
                }
              }
              _builder.newLineIfNotEmpty();
              String _join = IterableExtensions.join(l, ",");
              _builder.append(_join);
              _builder.newLineIfNotEmpty();
              _builder.append("\']\'");
              _builder.newLine();
            }
          }
        }
      }
    }
    return _builder;
  }
  
  /**
   * for(i data.typeOfList: data.typeOfList.
   * 
   * �val z = newLinkedList(data.typeOfList)�
   * �z.map[].join(',')�
   */
  public CharSequence generateAritmetica(final Aritmetica a) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<MyInt, Integer> _function = (MyInt it) -> {
      return Integer.valueOf(it.getValue());
    };
    String _join = IterableExtensions.join(ListExtensions.<MyInt, Integer>map(a.getArgument(), _function), this.generateOperadores(a.getOp()));
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateOperadores(final Operadores o) {
    StringConcatenation _builder = new StringConcatenation();
    String _op = o.getOp();
    _builder.append(_op);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateOperadores(final Bloque b) {
    StringConcatenation _builder = new StringConcatenation();
    EObject _eContainer = b.eContainer();
    String _name = ((FuncionSimplificada) _eContainer).getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence generateEqual(final Equal e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateVariables(final Variables v) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateFuncionSimplificada(final FuncionSimplificada f) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence generateEstructuras(final Estructuras e) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
}
