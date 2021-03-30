/*
 * generated by Xtext 2.24.0
 */
package edu.upb.lp.isc.generator

import edu.upb.lp.isc.compilacion.AllOp
import edu.upb.lp.isc.compilacion.Argument
import edu.upb.lp.isc.compilacion.Aritmetica
import edu.upb.lp.isc.compilacion.Bloque
import edu.upb.lp.isc.compilacion.Bool
import edu.upb.lp.isc.compilacion.Boolean_Op
import edu.upb.lp.isc.compilacion.CondicionIF
import edu.upb.lp.isc.compilacion.Data
import edu.upb.lp.isc.compilacion.Declaraciones
import edu.upb.lp.isc.compilacion.Define
import edu.upb.lp.isc.compilacion.Ejecucion
import edu.upb.lp.isc.compilacion.Equal
import edu.upb.lp.isc.compilacion.Estructuras
import edu.upb.lp.isc.compilacion.Expr
import edu.upb.lp.isc.compilacion.FuncionSimplificada
import edu.upb.lp.isc.compilacion.If
import edu.upb.lp.isc.compilacion.List
import edu.upb.lp.isc.compilacion.ListContent
import edu.upb.lp.isc.compilacion.List_Operation
import edu.upb.lp.isc.compilacion.LlamarFuncion
import edu.upb.lp.isc.compilacion.MyInt
import edu.upb.lp.isc.compilacion.MyString
import edu.upb.lp.isc.compilacion.Nativos
import edu.upb.lp.isc.compilacion.NoQuiereValidar
import edu.upb.lp.isc.compilacion.Operadores
import edu.upb.lp.isc.compilacion.Programa
import edu.upb.lp.isc.compilacion.ReturnF
import edu.upb.lp.isc.compilacion.Simple
import edu.upb.lp.isc.compilacion.Type
import edu.upb.lp.isc.compilacion.Variable
import edu.upb.lp.isc.compilacion.Vec
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class CompilacionGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
 	val a = resource.allContents.head as Programa
 	fsa.generateFile(a.name + ".cpp", generatePrograma(a))
	}
	
	
	
	
	def generatePrograma(Programa a) 
	'''
	�outsideMainMethods()�
	
	�FOR f: a.funciones��generateFuncionSimplificada(f)��ENDFOR�
	
	
	int main(){	    
		
		
	�FOR d: a.declaraciones�    �generateDeclaraciones(d)�
	
	�ENDFOR�
	
	�FOR e: a.ejecuciones�    �generateEjecucion(e)�
	
	�ENDFOR�
	
		return 0;
	}
	
	'''
	
	def outsideMainMethods()
'''
#include <bits/stdc++.h>
using namespace std;

template <typename T>
vector<T> tail(vector<T> l){
	return	vector<T> (l.begin()+1, l.end());
}

template <typename T>
T head(vector<T> l){
	return l[0];
}

template <typename T>
vector<T> concat(vector<T>& first, vector<T>& second){
	for(T i : second){
		first.push_back(i);
	}
	return first;
}
'''
		 
	def generateFuncionSimplificada(FuncionSimplificada f)
	'''
�generateType(f.typeOfFunction)� �f.name� (�var param= newLinkedList()��
		FOR e: f.parameter��{param.add(generateFuncParameters(e as Variable)); ""}��ENDFOR��param.join(' , ')�){
	�FOR i: f.then��generateBloque(i)��ENDFOR�
	return �generateReturnF(f.returnf as ReturnF)�;
}
	'''	
	/*
	 * '''template <typename T>
�generateType(f.typeOfFunction)� �f.name� (�var param= newLinkedList()��
		FOR e: f.parameter��{param.add('T '+generateArgument(e)); ""}��ENDFOR��param.join(' , ')�){
		�FOR i: f.then�    �generateBloque(i)��ENDFOR�
	    return �generateArgument(f.returnf as Argument)�;
}
	'''	
	 * 
	 * 
	 * 
	 * 
	 * 
	 * �var param= newLinkedList()
		��FOR e: f.parameter��{param.add(generateType(e as Type)+' '+generateArgument(e)) ;""}��ENDFOR�){
			
	 * 
	 * �var param= newLinkedList()��
	FOR e: f.parameter��{param.add(generateArgument(e)); ""}��ENDFOR��param.join(' , ')�){
	�FOR i: f.then�    �generateBloque(i)��ENDFOR�
	 */
	
	
	def generateEjecucion(Ejecucion e) 
	'''�IF e instanceof Expr� cout<<�generateExpr(e as Expr)�<<endl;�ENDIF�
	'''
	
	def generateFuncParameters(Variable fp)'''�generateType(fp.typeVar)� �fp.nombreaVar�'''
	
	def generateDeclaraciones(Declaraciones d) 
	'''�IF d instanceof Simple��
	generateSimple(d as Simple)��ENDIF�
	'''
	
	 
	def generateSimple(Simple s)
	'''�IF s instanceof Argument��
	generateArgument(s as Argument)��
	ELSEIF s instanceof Estructuras��
	generateEstructuras(s as Estructuras)��
	ENDIF�'''
	
	def generateArgument(Argument a)
	'''�IF a instanceof Variable��generateVariable(a as Variable)��
	ELSEIF a instanceof Expr��generateExpr(a as Expr)��ENDIF�'''
	
	def generateVariable(Variable v)'''�v.nombreaVar�'''
	
	
	def generateExpr(Expr e)
	'''�IF e instanceof Data��
	generateData(e as Data)��
	ELSEIF e instanceof Aritmetica��
	generateAritmetica(e as Aritmetica)��
	ELSEIF e instanceof Equal��
	generateEqual(e as Equal)��
	ELSEIF e instanceof FuncionSimplificada��
	generateFuncionSimplificada(e as FuncionSimplificada)��
	ELSEIF e instanceof Define��
	generateDefine(e as Define)��
	ELSEIF e instanceof List_Operation��
	generateList_Operation(e as List_Operation)��
	ELSEIF e instanceof LlamarFuncion��
	generateLlamarFuncion(e as LlamarFuncion)��ENDIF�'''
	
	
	def generateData(Data d) // TODO List
	'''�
	IF d instanceof MyInt��generateMyInt(d as MyInt)��
	ELSEIF d instanceof MyString��generateMyString(d as MyString)��
	ELSEIF d instanceof Bool��generateBool(d as Bool)��
	ELSEIF d instanceof List��generateList(d as List)��
	ENDIF�'''
	/*TODO REVISAR PARTE IMPRESION Y PARTE CODIGO
	 * generateDataType(d.typeOfList as DataType_)
	 * 
	 * 
	 * 
	 * 	�ELSEIF d instanceof List� 
		�val data = d as List�
		"["<< �var l = newLinkedList()�
		�FOR i: data.typeOfList��{l.add(generateDataType(i)); ""}��ENDFOR�
		�\\l.join('<<","<<')�<<"]"
		�ENDIF� this is list print
	 * 
	 * for(i data.typeOfList: data.typeOfList.
	 * 
	 * �val z = newLinkedList(data.typeOfList)�
	�z.map[].join(',')� */
	// cout<<"["<<dist[map['t']]<<"]";//TODO Revisar aritmetica
	
	def generateAritmetica(Aritmetica a)
	'''�var list= newLinkedList��
	FOR i : a.argument��{list.add(generateArgument(i)); ''}��ENDFOR�(�
	list.join(' '+generateAllOp(a.op as AllOp)+' ')�)'''
	
	def generateAllOp(AllOp ao)
	'''�IF ao instanceof Operadores��generateOperadores(ao as Operadores)��
	ELSEIF ao instanceof Boolean_Op��generateBooleanOp(ao as Boolean_Op)��ENDIF�'''
	
	
	def generateOperadores( Operadores o)'''�o.op�'''
	
	
	def generateBooleanOp(Boolean_Op b)'''�b.op�'''
	
	
	def generateType(Type typppe)'''�
	IF typppe instanceof Nativos��generateNativos(typppe as Nativos)��
	ELSEIF typppe instanceof Vec��generateVec(typppe as Vec)��ENDIF�'''
	
	
	
	def generateNativos(Nativos t)'''�t.nat�'''
	
	def generateVec(Vec vec)'''vector<�
	FOR index: vec.inside��
	IF index instanceof Vec��generateVec(index as Vec)��
	ELSEIF index instanceof Nativos��generateNativos(index as Nativos)��
	ENDIF��
	ENDFOR�>'''
	

	def generateDefine(Define d)
	'''�generateType(d.basta)� �d.name��
	IF d.parameter instanceof List����ELSE� = �ENDIF��generateArgument(d.parameter as Argument)�;'''
	
	def generateEqual(Equal e)'''(�e.data1�==�e.data2�)'''
	
	def generateList_Operation(List_Operation lco)//TODO operaciones con listas
	
	'''�IF lco.op == 'length'��generateSimple(lco.li)�.size()�
	ELSEIF lco.op == 'car'�head(�generateSimple(lco.li)�)�
	ELSEIF lco.op == 'cdr'�tail(�generateSimple(lco.li)�)�
	ELSEIF lco.op == 'concat'�concat(�generateNoQuiereValidar(lco.firstl)�,�
	generateNoQuiereValidar(lco.secondl)�)�ENDIF�'''
	
	def generateNoQuiereValidar(NoQuiereValidar nqv)'''�IF nqv instanceof List��
	generateList(nqv as List)��
	ELSEIF nqv instanceof Variable��generateVariable(nqv as Variable)��ENDIF�'''
	
	
	
	def generateReturnF(ReturnF rf)'''�generateSimple(rf as Simple)�'''
	
	def generateLlamarFuncion(LlamarFuncion lf)//TODO llamar Funcion
	'''�lf.nombreFuncion.name�(�var param= newLinkedList()��
	FOR i: lf.arguments��{param.add(generateArgument(i)); ""}��ENDFOR��
	param.join(",")�)'''
	
	
	def generateEstructuras(Estructuras e)
	'''�IF e instanceof If��generateIf(e as If)��ENDIF�'''
	
	
	
	
	def generateIf(If i)
	'''
	
	
	if(�generateCondicionIF(i.condition)�){
		�FOR w: i.then��generateBloque(w as Bloque)��ENDFOR�
	}else{
		�FOR w: i.eelse��generateBloque(w as Bloque)��ENDFOR�
	}
	
	'''
	
	
	def generateCondicionIF(CondicionIF ci)
	'''�IF ci instanceof Equal��generateEqual(ci as Equal)��
	ELSEIF ci instanceof Aritmetica��generateAritmetica(ci as Aritmetica)��
	ELSEIF ci instanceof LlamarFuncion��generateLlamarFuncion(ci as LlamarFuncion)��ENDIF�'''
	
	
	
	
	def generateBloque(Bloque b)'''�generateSimple(b as Simple)�'''
	
	def generateMyInt(MyInt i)'''�i.value�'''
	
	def generateMyString(MyString s)'''"�s.value�"'''
	
	def generateBool(Bool b)'''�b.value�'''
	
	def generateList(List l)
	''' {�var newList = newLinkedList()��
	FOR i: l.datal��{newList.add(generateListContent(i)); ""}��ENDFOR��
	newList.join(' , ')�}'''
	
	def generateListContent(ListContent lc)
	'''�IF lc instanceof Data��generateData(lc as Data)��
	ELSEIF lc instanceof Variable��generateVariable(lc as Variable)��ENDIF�'''
	}