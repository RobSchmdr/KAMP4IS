/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.impl.ChangePropagationStepImpl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToConfigurationDependencies;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent;
import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Change Propagation Due To Configuration Dependencies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToConfigurationDependenciesImpl#getIsmodifyconfiguration <em>Ismodifyconfiguration</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl.ISChangePropagationDueToConfigurationDependenciesImpl#getIsmodifycomponent <em>Ismodifycomponent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISChangePropagationDueToConfigurationDependenciesImpl extends ChangePropagationStepImpl implements ISChangePropagationDueToConfigurationDependencies {
	/**
	 * The cached value of the '{@link #getIsmodifyconfiguration() <em>Ismodifyconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmodifyconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyConfiguration> ismodifyconfiguration;

	/**
	 * The cached value of the '{@link #getIsmodifycomponent() <em>Ismodifycomponent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmodifycomponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ISModifyComponent> ismodifycomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISChangePropagationDueToConfigurationDependenciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISModificationmarksPackage.Literals.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyConfiguration> getIsmodifyconfiguration() {
		if (ismodifyconfiguration == null) {
			ismodifyconfiguration = new EObjectContainmentEList<ISModifyConfiguration>(ISModifyConfiguration.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION);
		}
		return ismodifyconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISModifyComponent> getIsmodifycomponent() {
		if (ismodifycomponent == null) {
			ismodifycomponent = new EObjectContainmentEList<ISModifyComponent>(ISModifyComponent.class, this, ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT);
		}
		return ismodifycomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION:
				return ((InternalEList<?>)getIsmodifyconfiguration()).basicRemove(otherEnd, msgs);
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT:
				return ((InternalEList<?>)getIsmodifycomponent()).basicRemove(otherEnd, msgs);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION:
				return getIsmodifyconfiguration();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT:
				return getIsmodifycomponent();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION:
				getIsmodifyconfiguration().clear();
				getIsmodifyconfiguration().addAll((Collection<? extends ISModifyConfiguration>)newValue);
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT:
				getIsmodifycomponent().clear();
				getIsmodifycomponent().addAll((Collection<? extends ISModifyComponent>)newValue);
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION:
				getIsmodifyconfiguration().clear();
				return;
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT:
				getIsmodifycomponent().clear();
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
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCONFIGURATION:
				return ismodifyconfiguration != null && !ismodifyconfiguration.isEmpty();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES__ISMODIFYCOMPONENT:
				return ismodifycomponent != null && !ismodifycomponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISChangePropagationDueToConfigurationDependenciesImpl
