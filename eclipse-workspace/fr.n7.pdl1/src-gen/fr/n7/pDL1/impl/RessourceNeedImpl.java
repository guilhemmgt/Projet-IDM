/**
 * generated by Xtext 2.32.0
 */
package fr.n7.pDL1.impl;

import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.Ressource;
import fr.n7.pDL1.RessourceNeed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ressource Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL1.impl.RessourceNeedImpl#getNeed <em>Need</em>}</li>
 *   <li>{@link fr.n7.pDL1.impl.RessourceNeedImpl#getLinkToRessource <em>Link To Ressource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RessourceNeedImpl extends MinimalEObjectImpl.Container implements RessourceNeed
{
  /**
   * The default value of the '{@link #getNeed() <em>Need</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeed()
   * @generated
   * @ordered
   */
  protected static final int NEED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNeed() <em>Need</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeed()
   * @generated
   * @ordered
   */
  protected int need = NEED_EDEFAULT;

  /**
   * The cached value of the '{@link #getLinkToRessource() <em>Link To Ressource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkToRessource()
   * @generated
   * @ordered
   */
  protected Ressource linkToRessource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RessourceNeedImpl()
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
    return PDL1Package.Literals.RESSOURCE_NEED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNeed()
  {
    return need;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNeed(int newNeed)
  {
    int oldNeed = need;
    need = newNeed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.RESSOURCE_NEED__NEED, oldNeed, need));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ressource getLinkToRessource()
  {
    if (linkToRessource != null && linkToRessource.eIsProxy())
    {
      InternalEObject oldLinkToRessource = (InternalEObject)linkToRessource;
      linkToRessource = (Ressource)eResolveProxy(oldLinkToRessource);
      if (linkToRessource != oldLinkToRessource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE, oldLinkToRessource, linkToRessource));
      }
    }
    return linkToRessource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ressource basicGetLinkToRessource()
  {
    return linkToRessource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinkToRessource(Ressource newLinkToRessource)
  {
    Ressource oldLinkToRessource = linkToRessource;
    linkToRessource = newLinkToRessource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE, oldLinkToRessource, linkToRessource));
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
      case PDL1Package.RESSOURCE_NEED__NEED:
        return getNeed();
      case PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE:
        if (resolve) return getLinkToRessource();
        return basicGetLinkToRessource();
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
      case PDL1Package.RESSOURCE_NEED__NEED:
        setNeed((Integer)newValue);
        return;
      case PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE:
        setLinkToRessource((Ressource)newValue);
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
      case PDL1Package.RESSOURCE_NEED__NEED:
        setNeed(NEED_EDEFAULT);
        return;
      case PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE:
        setLinkToRessource((Ressource)null);
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
      case PDL1Package.RESSOURCE_NEED__NEED:
        return need != NEED_EDEFAULT;
      case PDL1Package.RESSOURCE_NEED__LINK_TO_RESSOURCE:
        return linkToRessource != null;
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
    result.append(" (need: ");
    result.append(need);
    result.append(')');
    return result.toString();
  }

} //RessourceNeedImpl