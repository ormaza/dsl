/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.memorando.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.memorando.Destino;
import org.xtext.example.mydsl.memorando.MemorandoPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Destino</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.DestinoImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DestinoImpl extends MinimalEObjectImpl.Container implements Destino
{
  /**
   * The default value of the '{@link #getDestino() <em>Destino</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestino()
   * @generated
   * @ordered
   */
  protected static final String DESTINO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestino() <em>Destino</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestino()
   * @generated
   * @ordered
   */
  protected String destino = DESTINO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DestinoImpl()
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
    return MemorandoPackage.Literals.DESTINO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDestino()
  {
    return destino;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDestino(String newDestino)
  {
    String oldDestino = destino;
    destino = newDestino;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.DESTINO__DESTINO, oldDestino, destino));
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
      case MemorandoPackage.DESTINO__DESTINO:
        return getDestino();
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
      case MemorandoPackage.DESTINO__DESTINO:
        setDestino((String)newValue);
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
      case MemorandoPackage.DESTINO__DESTINO:
        setDestino(DESTINO_EDEFAULT);
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
      case MemorandoPackage.DESTINO__DESTINO:
        return DESTINO_EDEFAULT == null ? destino != null : !DESTINO_EDEFAULT.equals(destino);
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
    result.append(" (destino: ");
    result.append(destino);
    result.append(')');
    return result.toString();
  }

} //DestinoImpl
