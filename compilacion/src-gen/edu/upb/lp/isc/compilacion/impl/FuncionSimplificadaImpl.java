/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.compilacion.impl;

import edu.upb.lp.isc.compilacion.Bloque;
import edu.upb.lp.isc.compilacion.CompilacionPackage;
import edu.upb.lp.isc.compilacion.DataType_;
import edu.upb.lp.isc.compilacion.FuncionSimplificada;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcion Simplificada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.compilacion.impl.FuncionSimplificadaImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.upb.lp.isc.compilacion.impl.FuncionSimplificadaImpl#getAtributo <em>Atributo</em>}</li>
 *   <li>{@link edu.upb.lp.isc.compilacion.impl.FuncionSimplificadaImpl#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuncionSimplificadaImpl extends ExprImpl implements FuncionSimplificada
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAtributo() <em>Atributo</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributo()
   * @generated
   * @ordered
   */
  protected EList<DataType_> atributo;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected Bloque then;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FuncionSimplificadaImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CompilacionPackage.Literals.FUNCION_SIMPLIFICADA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompilacionPackage.FUNCION_SIMPLIFICADA__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<DataType_> getAtributo()
  {
    if (atributo == null)
    {
      atributo = new EObjectContainmentEList<DataType_>(DataType_.class, this, CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO);
    }
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bloque getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(Bloque newThen, NotificationChain msgs)
  {
    Bloque oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CompilacionPackage.FUNCION_SIMPLIFICADA__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setThen(Bloque newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CompilacionPackage.FUNCION_SIMPLIFICADA__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CompilacionPackage.FUNCION_SIMPLIFICADA__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompilacionPackage.FUNCION_SIMPLIFICADA__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO:
        return ((InternalEList<?>)getAtributo()).basicRemove(otherEnd, msgs);
      case CompilacionPackage.FUNCION_SIMPLIFICADA__THEN:
        return basicSetThen(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CompilacionPackage.FUNCION_SIMPLIFICADA__NAME:
        return getName();
      case CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO:
        return getAtributo();
      case CompilacionPackage.FUNCION_SIMPLIFICADA__THEN:
        return getThen();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CompilacionPackage.FUNCION_SIMPLIFICADA__NAME:
        setName((String)newValue);
        return;
      case CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO:
        getAtributo().clear();
        getAtributo().addAll((Collection<? extends DataType_>)newValue);
        return;
      case CompilacionPackage.FUNCION_SIMPLIFICADA__THEN:
        setThen((Bloque)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CompilacionPackage.FUNCION_SIMPLIFICADA__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO:
        getAtributo().clear();
        return;
      case CompilacionPackage.FUNCION_SIMPLIFICADA__THEN:
        setThen((Bloque)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CompilacionPackage.FUNCION_SIMPLIFICADA__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CompilacionPackage.FUNCION_SIMPLIFICADA__ATRIBUTO:
        return atributo != null && !atributo.isEmpty();
      case CompilacionPackage.FUNCION_SIMPLIFICADA__THEN:
        return then != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //FuncionSimplificadaImpl
