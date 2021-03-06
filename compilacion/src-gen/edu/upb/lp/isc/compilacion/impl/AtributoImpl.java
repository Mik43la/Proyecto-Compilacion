/**
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.compilacion.impl;

import edu.upb.lp.isc.compilacion.Atributo;
import edu.upb.lp.isc.compilacion.CompilacionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atributo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.upb.lp.isc.compilacion.impl.AtributoImpl#getAtributoName <em>Atributo Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtributoImpl extends MinimalEObjectImpl.Container implements Atributo
{
  /**
   * The default value of the '{@link #getAtributoName() <em>Atributo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributoName()
   * @generated
   * @ordered
   */
  protected static final String ATRIBUTO_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtributoName() <em>Atributo Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributoName()
   * @generated
   * @ordered
   */
  protected String atributoName = ATRIBUTO_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtributoImpl()
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
    return CompilacionPackage.Literals.ATRIBUTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAtributoName()
  {
    return atributoName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAtributoName(String newAtributoName)
  {
    String oldAtributoName = atributoName;
    atributoName = newAtributoName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CompilacionPackage.ATRIBUTO__ATRIBUTO_NAME, oldAtributoName, atributoName));
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
      case CompilacionPackage.ATRIBUTO__ATRIBUTO_NAME:
        return getAtributoName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CompilacionPackage.ATRIBUTO__ATRIBUTO_NAME:
        setAtributoName((String)newValue);
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
      case CompilacionPackage.ATRIBUTO__ATRIBUTO_NAME:
        setAtributoName(ATRIBUTO_NAME_EDEFAULT);
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
      case CompilacionPackage.ATRIBUTO__ATRIBUTO_NAME:
        return ATRIBUTO_NAME_EDEFAULT == null ? atributoName != null : !ATRIBUTO_NAME_EDEFAULT.equals(atributoName);
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
    result.append(" (atributoName: ");
    result.append(atributoName);
    result.append(')');
    return result.toString();
  }

} //AtributoImpl
