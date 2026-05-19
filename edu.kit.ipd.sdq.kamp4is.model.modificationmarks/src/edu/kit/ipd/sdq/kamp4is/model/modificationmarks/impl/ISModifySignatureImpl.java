/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Modify Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl#getOperationTimingModification <em>Operation Timing Modification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISModifySignatureImpl extends ISModifyEntityImpl<Signature> implements ISModifySignature {
	/**
	 * The cached value of the '{@link #getOperationTimingModification() <em>Operation Timing Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTimingModification()
	 * @generated
	 * @ordered
	 */
	protected ISModifyOperationTiming operationTimingModification;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISModifySignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_MODIFY_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyOperationTiming getOperationTimingModification() {
		return operationTimingModification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationTimingModification(ISModifyOperationTiming newOperationTimingModification, NotificationChain msgs) {
		ISModifyOperationTiming oldOperationTimingModification = operationTimingModification;
		operationTimingModification = newOperationTimingModification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION, oldOperationTimingModification, newOperationTimingModification);
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
	public void setOperationTimingModification(ISModifyOperationTiming newOperationTimingModification) {
		if (newOperationTimingModification != operationTimingModification) {
			NotificationChain msgs = null;
			if (operationTimingModification != null)
				msgs = ((InternalEObject)operationTimingModification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION, null, msgs);
			if (newOperationTimingModification != null)
				msgs = ((InternalEObject)newOperationTimingModification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION, null, msgs);
			msgs = basicSetOperationTimingModification(newOperationTimingModification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION, newOperationTimingModification, newOperationTimingModification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION:
				return basicSetOperationTimingModification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION:
				return getOperationTimingModification();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION:
				setOperationTimingModification((ISModifyOperationTiming)newValue);
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION:
				setOperationTimingModification((ISModifyOperationTiming)null);
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__OPERATION_TIMING_MODIFICATION:
				return operationTimingModification != null;
		}
		return super.eIsSet(featureID);
	}

} //ISModifySignatureImpl
