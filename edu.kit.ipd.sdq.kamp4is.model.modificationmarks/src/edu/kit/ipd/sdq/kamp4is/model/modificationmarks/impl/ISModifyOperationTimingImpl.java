/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ModificationImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Modify Operation Timing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifyOperationTimingImpl#getIsmodifysignature <em>Ismodifysignature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISModifyOperationTimingImpl extends ModificationImpl implements ISModifyOperationTiming {
	/**
	 * The cached value of the '{@link #getIsmodifysignature() <em>Ismodifysignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmodifysignature()
	 * @generated
	 * @ordered
	 */
	protected ISModifySignature ismodifysignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISModifyOperationTimingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_MODIFY_OPERATION_TIMING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifySignature getIsmodifysignature() {
		if (ismodifysignature != null && ismodifysignature.eIsProxy()) {
			InternalEObject oldIsmodifysignature = (InternalEObject)ismodifysignature;
			ismodifysignature = (ISModifySignature)eResolveProxy(oldIsmodifysignature);
			if (ismodifysignature != oldIsmodifysignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE, oldIsmodifysignature, ismodifysignature));
			}
		}
		return ismodifysignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModifySignature basicGetIsmodifysignature() {
		return ismodifysignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsmodifysignature(ISModifySignature newIsmodifysignature) {
		ISModifySignature oldIsmodifysignature = ismodifysignature;
		ismodifysignature = newIsmodifysignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE, oldIsmodifysignature, ismodifysignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE:
				if (resolve) return getIsmodifysignature();
				return basicGetIsmodifysignature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE:
				setIsmodifysignature((ISModifySignature)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE:
				setIsmodifysignature((ISModifySignature)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING__ISMODIFYSIGNATURE:
				return ismodifysignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ISModifyOperationTimingImpl
