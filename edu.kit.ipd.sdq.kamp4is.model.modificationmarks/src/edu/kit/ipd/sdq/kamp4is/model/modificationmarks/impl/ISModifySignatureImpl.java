/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Modify Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISModifySignatureImpl#getIsmodifyoperationtiming <em>Ismodifyoperationtiming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISModifySignatureImpl extends ISModifyEntityImpl<Signature> implements ISModifySignature {
	/**
	 * The cached value of the '{@link #getIsmodifyoperationtiming() <em>Ismodifyoperationtiming</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmodifyoperationtiming()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyOperationTiming> ismodifyoperationtiming;

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
	public EList<ISModifyOperationTiming> getIsmodifyoperationtiming() {
		if (ismodifyoperationtiming == null) {
			ismodifyoperationtiming = new EObjectContainmentEList<ISModifyOperationTiming>(ISModifyOperationTiming.class, this, ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING);
		}
		return ismodifyoperationtiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING:
				return ((InternalEList<?>)getIsmodifyoperationtiming()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING:
				return getIsmodifyoperationtiming();
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING:
				getIsmodifyoperationtiming().clear();
				getIsmodifyoperationtiming().addAll((Collection<? extends ISModifyOperationTiming>)newValue);
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING:
				getIsmodifyoperationtiming().clear();
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
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE__ISMODIFYOPERATIONTIMING:
				return ismodifyoperationtiming != null && !ismodifyoperationtiming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISModifySignatureImpl
