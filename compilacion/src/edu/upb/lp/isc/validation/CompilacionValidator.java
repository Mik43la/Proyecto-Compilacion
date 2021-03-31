/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

import edu.upb.lp.isc.compilacion.Argument;
import edu.upb.lp.isc.compilacion.Aritmetica;
import edu.upb.lp.isc.compilacion.Bloque;
import edu.upb.lp.isc.compilacion.CompilacionPackage;
import edu.upb.lp.isc.compilacion.Declaraciones;
import edu.upb.lp.isc.compilacion.FuncionSimplificada;
import edu.upb.lp.isc.compilacion.If;
import edu.upb.lp.isc.compilacion.List;
import edu.upb.lp.isc.compilacion.ListContent;
import edu.upb.lp.isc.compilacion.LlamarFuncion;
import edu.upb.lp.isc.compilacion.MyInt;
import edu.upb.lp.isc.compilacion.Programa;
import edu.upb.lp.isc.compilacion.Simple;
import edu.upb.lp.isc.compilacion.Variable;

/**
 * This class contains custom validation rules.
 *
 * See
 * https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CompilacionValidator extends AbstractCompilacionValidator {

//	public static final String INVALID_NAME = "invalidName";
//
//	@Check
//	public void checkGreetingStartsWithCapital(Aritmetica greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital",
//					CompilacionPackage.Literals.GREETING__NAME,
//					INVALID_NAME);
//		}
//	}

	public static final String INVALID_NAME = "mal";
	public static final EStructuralFeature F = null;


//.matches("[0-9]*"
	@Check
	public void checkAritmeticaDosIntsEQR(Aritmetica aritmetica) {
		if ( aritmetica.getOp().getOp().equals("expt")
				|| aritmetica.getOp().getOp().equals("remainder") || aritmetica.getOp().getOp().equals("quotient") 
				|| aritmetica.getOp().getOp().equals("+") || aritmetica.getOp().getOp().equals("-")
				|| aritmetica.getOp().getOp().equals("*") || aritmetica.getOp().getOp().equals("/") ) {
			if (!(aritmetica.getArgument().get(0).getClass().getSimpleName().equals("MyIntImpl") || aritmetica.getArgument().get(0).getClass().getSimpleName().equals("AritmeticaImpl")
					|| aritmetica.getArgument().get(0).getClass().getSimpleName().equals("VariableImpl") || aritmetica.getArgument().get(0).getClass().getSimpleName().equals("LlamarFuncionImpl"))) {
				error("expt, quotient y remainder son (op Int Int)"+ aritmetica.getArgument().get(0).getClass().getSimpleName(), CompilacionPackage.Literals.ARITMETICA__ARGUMENT,
						INVALID_NAME);
			}else if (!(aritmetica.getArgument().get(1).getClass().getSimpleName().equals("MyIntImpl") || aritmetica.getArgument().get(1).getClass().getSimpleName().equals("AritmeticaImpl" )
					|| aritmetica.getArgument().get(1).getClass().getSimpleName().equals("VariableImpl" )|| aritmetica.getArgument().get(1).getClass().getSimpleName().equals("LlamarFuncionImpl")
					)) {//|| aritmetica.getArgument().get(1).getClass().getSimpleName().equals("VariableImpl")
				error("expt, quotient y remainder son (op Int Int)"+ aritmetica.getArgument().get(1).getClass().getSimpleName(), CompilacionPackage.Literals.ARITMETICA__ARGUMENT,
						INVALID_NAME);
			}
		}
	}
	//AritmeticaImpl
	@Check
	public void checkListaAny(List lista) {
		for (ListContent variable: lista.getDatal()) {
			String auxi=lista.getDatal().get(0).getClass().getSimpleName();
			if (!(variable.getClass().getSimpleName().equals(auxi))) {
				error("no (List Any)", CompilacionPackage.Literals.LIST__DATAL,
						INVALID_NAME);
			}
		}
	}
//	@Check
//	public void checkIncongrucion(Aritmetica aritmetica) {
//		if (aritmetica.getOp().toString() == "/") {
//			if (aritmetica.getArgument().get(0).toString() == "0" && aritmetica.getArgument().get(1).toString() == "0") {
//				error("expt, quotient y remainder son (op Int Int)", CompilacionPackage.Literals.ARITMETICA__ARGUMENT,
//						INVALID_NAME);
//			}
//		}
//	}
	@Check
	public void checkTamanio(Aritmetica aritmetica) { //{'<' | '>=' | '>' | '<=' | '!='
		if (aritmetica.getOp().getOp().equals("/") || aritmetica.getOp().getOp().equals("*") || aritmetica.getOp().getOp().equals("expt")
				|| aritmetica.getOp().getOp().equals("remainder") || aritmetica.getOp().getOp().equals("quotient") || aritmetica.getOp().getOp().equals("<") 
				|| aritmetica.getOp().getOp().equals(">=") || aritmetica.getOp().getOp().equals(">") || aritmetica.getOp().getOp().equals("<=") ||
				aritmetica.getOp().getOp().equals("!=") || aritmetica.getOp().getOp().equals("==")){
				//	|| aritmetsica.getOp().toString() == "remainder") {
			if (aritmetica.getArgument().size() > 2) {
				error("(op data1 data2) no mas de dos datas", CompilacionPackage.Literals.ARITMETICA__ARGUMENT,
						INVALID_NAME);
			}
		}
	}
	
	@Check
	public void checkDataSuelta(Programa prog) {
		for (Declaraciones variable: prog.getDeclaraciones() ){
			if (variable.getClass().getSimpleName().equals("MyIntImpl") || variable.getClass().getSimpleName().equals("MyStringImpl") ||
					variable.getClass().getSimpleName().equals("ListImpl") || variable.getClass().getSimpleName().equals("BoolImpl")||
					variable.getClass().getSimpleName().equals("VariableImpl")  ) {
				error("not only cons", CompilacionPackage.Literals.DECLARACIONES,
						F);
			}
		}
	}
	
	@Check
	public void checkDataSueltaBloque(If fi) {
		//for (Bloque variable: iiif.getThen() ){
		for (Bloque variable: fi.getThen() ){
			if (variable.getClass().getSimpleName().equals("MyIntImpl") || variable.getClass().getSimpleName().equals("MyStringImpl") ||
					variable.getClass().getSimpleName().equals("ListImpl") || variable.getClass().getSimpleName().equals("BoolImpl")||
					variable.getClass().getSimpleName().equals("VariableImpl")) {
				error("not only cons", CompilacionPackage.Literals.DECLARACIONES,
						F);
			}
		}
	
			 		
		
		if(fi.getEelse().size() > 0) {
		for (Bloque variable: fi.getEelse() ){
			if (variable.getClass().getSimpleName().equals("MyIntImpl") || variable.getClass().getSimpleName().equals("MyStringImpl") ||
					variable.getClass().getSimpleName().equals("ListImpl") || variable.getClass().getSimpleName().equals("BoolImpl")||
					variable.getClass().getSimpleName().equals("VariableImpl")) {
				error("not only cons", CompilacionPackage.Literals.IF__EELSE,
						INVALID_NAME);
			}
		}
		}
		
	}


	@Check
	public void checkBLoqueFun(FuncionSimplificada isNotFun) {
		//for (Bloque variable: iiif.getThen() ){
		if(isNotFun.getThen().size() > 0) {
		for (Bloque variable: isNotFun.getThen() ){
			if (variable.getClass().getSimpleName().equals("MyIntImpl") || variable.getClass().getSimpleName().equals("MyStringImpl") ||
					variable.getClass().getSimpleName().equals("ListImpl") || variable.getClass().getSimpleName().equals("BoolImpl")||
					variable.getClass().getSimpleName().equals("VariableImpl")) {
				error("not only cons", CompilacionPackage.Literals.FUNCION_SIMPLIFICADA__THEN,
						INVALID_NAME);
			}
		}
		}
	}
	
//	@Check
//	public void checkAtributisFun(LlamarFuncion llam, FuncionSimplificada notFun) {
//		//for (Bloque variable: iiif.getThen() ){
//		int aux = 0;
//		for (Argument variable: notFun.getParameter()) {
//			if(variable.getClass().getSimpleName().equals(llam.getArguments().get(aux).getClass().getSimpleName()))
//		error("not only cons", CompilacionPackage.Literals.LLAMAR_FUNCION__NOMBRE_FUNCION,
//					INVALID_NAME);
//			
//		}
//		
//
//	}
	



//TODO lo de aritmetica check
//TODO lo de aritmetica check no mas de 2
// TODO LISTAS no LIST any check
// TODO llamados de funciones con el mismo tamanio
// TODO llamados de funciones con el mismo tipo de dato
// TODO incongruencias matematicas decartado

//Variables con el mismo tipo de dato??
	



}
