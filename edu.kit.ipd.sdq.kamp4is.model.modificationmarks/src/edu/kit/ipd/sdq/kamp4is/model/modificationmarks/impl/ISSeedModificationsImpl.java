/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.AbstractSeedModificationsImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyDataType;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyInterface;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISSeedModifications;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Seed Modifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl#getDataTypeModifications <em>Data Type Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl#getSignatureModifications <em>Signature Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl#getInterfaceModifications <em>Interface Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl#getComponentModifications <em>Component Modifications</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISSeedModificationsImpl#getIsmodifyoperationtiming <em>Ismodifyoperationtiming</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISSeedModificationsImpl extends AbstractSeedModificationsImpl implements ISSeedModifications {
	/**
	 * The cached value of the '{@link #getDataTypeModifications() <em>Data Type Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypeModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyDataType> dataTypeModifications;

	/**
	 * The cached value of the '{@link #getSignatureModifications() <em>Signature Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatureModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifySignature> signatureModifications;

	/**
	 * The cached value of the '{@link #getInterfaceModifications() <em>Interface Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyInterface> interfaceModifications;

	/**
	 * The cached value of the '{@link #getComponentModifications() <em>Component Modifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentModifications()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyComponent> componentModifications;

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
	protected ISSeedModificationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_SEED_MODIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyDataType> getDataTypeModifications() {
		if (dataTypeModifications == null) {
			dataTypeModifications = new EObjectContainmentEList<ISModifyDataType>(ISModifyDataType.class, this, ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS);
		}
		return dataTypeModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifySignature> getSignatureModifications() {
		if (signatureModifications == null) {
			signatureModifications = new EObjectContainmentEList<ISModifySignature>(ISModifySignature.class, this, ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS);
		}
		return signatureModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyInterface> getInterfaceModifications() {
		if (interfaceModifications == null) {
			interfaceModifications = new EObjectContainmentEList<ISModifyInterface>(ISModifyInterface.class, this, ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS);
		}
		return interfaceModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyComponent> getComponentModifications() {
		if (componentModifications == null) {
			componentModifications = new EObjectContainmentEList<ISModifyComponent>(ISModifyComponent.class, this, ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS);
		}
		return componentModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyOperationTiming> getIsmodifyoperationtiming() {
		if (ismodifyoperationtiming == null) {
			ismodifyoperationtiming = new EObjectContainmentEList<ISModifyOperationTiming>(ISModifyOperationTiming.class, this, ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING);
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
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS:
				return ((InternalEList<?>)getDataTypeModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS:
				return ((InternalEList<?>)getSignatureModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return ((InternalEList<?>)getInterfaceModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return ((InternalEList<?>)getComponentModifications()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING:
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
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS:
				return getDataTypeModifications();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS:
				return getSignatureModifications();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return getInterfaceModifications();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return getComponentModifications();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING:
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
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS:
				getDataTypeModifications().clear();
				getDataTypeModifications().addAll((Collection<? extends ISModifyDataType>)newValue);
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
				getSignatureModifications().addAll((Collection<? extends ISModifySignature>)newValue);
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				getInterfaceModifications().addAll((Collection<? extends ISModifyInterface>)newValue);
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				getComponentModifications().addAll((Collection<? extends ISModifyComponent>)newValue);
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING:
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
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS:
				getDataTypeModifications().clear();
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS:
				getSignatureModifications().clear();
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				getInterfaceModifications().clear();
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				getComponentModifications().clear();
				return;
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING:
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
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__DATA_TYPE_MODIFICATIONS:
				return dataTypeModifications != null && !dataTypeModifications.isEmpty();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__SIGNATURE_MODIFICATIONS:
				return signatureModifications != null && !signatureModifications.isEmpty();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__INTERFACE_MODIFICATIONS:
				return interfaceModifications != null && !interfaceModifications.isEmpty();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__COMPONENT_MODIFICATIONS:
				return componentModifications != null && !componentModifications.isEmpty();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS__ISMODIFYOPERATIONTIMING:
				return ismodifyoperationtiming != null && !ismodifyoperationtiming.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISSeedModificationsImpl
