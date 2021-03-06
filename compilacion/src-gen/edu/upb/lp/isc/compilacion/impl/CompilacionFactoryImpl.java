/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.compilacion.impl;

import edu.upb.lp.isc.compilacion.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompilacionFactoryImpl extends EFactoryImpl implements CompilacionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CompilacionFactory init()
  {
    try
    {
      CompilacionFactory theCompilacionFactory = (CompilacionFactory)EPackage.Registry.INSTANCE.getEFactory(CompilacionPackage.eNS_URI);
      if (theCompilacionFactory != null)
      {
        return theCompilacionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CompilacionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompilacionFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CompilacionPackage.PROGRAMA: return createPrograma();
      case CompilacionPackage.EJECUCION: return createEjecucion();
      case CompilacionPackage.DECLARACIONES: return createDeclaraciones();
      case CompilacionPackage.SIMPLE: return createSimple();
      case CompilacionPackage.IMPRIMIBLE: return createImprimible();
      case CompilacionPackage.NO_IMPRIMIBLE: return createNoImprimible();
      case CompilacionPackage.EXPR: return createExpr();
      case CompilacionPackage.DATA_TYPE_: return createDataType_();
      case CompilacionPackage.MY_INT: return createMyInt();
      case CompilacionPackage.MY_STRING: return createMyString();
      case CompilacionPackage.MY_BOOL: return createMyBool();
      case CompilacionPackage.IS_DATA_TYPE: return createIsDataType();
      case CompilacionPackage.ARITMETICA: return createAritmetica();
      case CompilacionPackage.OPERADORES: return createOperadores();
      case CompilacionPackage.VARIABLES: return createVariables();
      case CompilacionPackage.BOOLEAN_OP: return createBoolean_Op();
      case CompilacionPackage.BOOL: return createBool();
      case CompilacionPackage.ESTRUCTURAS: return createEstructuras();
      case CompilacionPackage.LIST: return createList();
      case CompilacionPackage.LARGO_LISTA: return createLargoLista();
      case CompilacionPackage.ATRIBUTO: return createAtributo();
      case CompilacionPackage.FUNCION_SIMPLIFICADA: return createFuncionSimplificada();
      case CompilacionPackage.EQUAL: return createEqual();
      case CompilacionPackage.IF: return createIf();
      case CompilacionPackage.BLOQUE: return createBloque();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Programa createPrograma()
  {
    ProgramaImpl programa = new ProgramaImpl();
    return programa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ejecucion createEjecucion()
  {
    EjecucionImpl ejecucion = new EjecucionImpl();
    return ejecucion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaraciones createDeclaraciones()
  {
    DeclaracionesImpl declaraciones = new DeclaracionesImpl();
    return declaraciones;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Simple createSimple()
  {
    SimpleImpl simple = new SimpleImpl();
    return simple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Imprimible createImprimible()
  {
    ImprimibleImpl imprimible = new ImprimibleImpl();
    return imprimible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NoImprimible createNoImprimible()
  {
    NoImprimibleImpl noImprimible = new NoImprimibleImpl();
    return noImprimible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataType_ createDataType_()
  {
    DataType_Impl dataType_ = new DataType_Impl();
    return dataType_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyInt createMyInt()
  {
    MyIntImpl myInt = new MyIntImpl();
    return myInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyString createMyString()
  {
    MyStringImpl myString = new MyStringImpl();
    return myString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyBool createMyBool()
  {
    MyBoolImpl myBool = new MyBoolImpl();
    return myBool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IsDataType createIsDataType()
  {
    IsDataTypeImpl isDataType = new IsDataTypeImpl();
    return isDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Aritmetica createAritmetica()
  {
    AritmeticaImpl aritmetica = new AritmeticaImpl();
    return aritmetica;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operadores createOperadores()
  {
    OperadoresImpl operadores = new OperadoresImpl();
    return operadores;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variables createVariables()
  {
    VariablesImpl variables = new VariablesImpl();
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Boolean_Op createBoolean_Op()
  {
    Boolean_OpImpl boolean_Op = new Boolean_OpImpl();
    return boolean_Op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bool createBool()
  {
    BoolImpl bool = new BoolImpl();
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Estructuras createEstructuras()
  {
    EstructurasImpl estructuras = new EstructurasImpl();
    return estructuras;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LargoLista createLargoLista()
  {
    LargoListaImpl largoLista = new LargoListaImpl();
    return largoLista;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FuncionSimplificada createFuncionSimplificada()
  {
    FuncionSimplificadaImpl funcionSimplificada = new FuncionSimplificadaImpl();
    return funcionSimplificada;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equal createEqual()
  {
    EqualImpl equal = new EqualImpl();
    return equal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bloque createBloque()
  {
    BloqueImpl bloque = new BloqueImpl();
    return bloque;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompilacionPackage getCompilacionPackage()
  {
    return (CompilacionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CompilacionPackage getPackage()
  {
    return CompilacionPackage.eINSTANCE;
  }

} //CompilacionFactoryImpl
