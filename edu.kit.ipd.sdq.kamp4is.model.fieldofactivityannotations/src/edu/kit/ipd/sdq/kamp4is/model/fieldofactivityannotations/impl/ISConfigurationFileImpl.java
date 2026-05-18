/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISConfigurationFile;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Configuration File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISConfigurationFileImpl#getDependentConfigurations <em>Dependent Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISConfigurationFileImpl extends ISSourceFileImpl implements ISConfigurationFile {
	/**
	 * The cached value of the '{@link #getDependentConfigurations() <em>Dependent Configurations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependentConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISConfigurationFile> dependentConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISConfigurationFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_CONFIGURATION_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISConfigurationFile> getDependentConfigurations() {
		if (dependentConfigurations == null) {
			dependentConfigurations = new EObjectResolvingEList<ISConfigurationFile>(ISConfigurationFile.class, this, ISFieldOfActivityAnnotationsPackage.IS_CONFIGURATION_FILE__DEPENDENT_CONFIGURATIONS);
		}
		return dependentConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_CONFIGURATION_FILE__DEPENDENT_CONFIGURATIONS:
				return getDependentConfigurations();
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
			case ISFieldOfActivityAnnotationsPackage.IS_CONFIGURATION_FILE__DEPENDENT_CONFIGURATIONS:
				getDependentConfigurations().clear();
				getDependentConfigurations().addAll((Collection<? extends ISConfigurationFile>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_CONFIGURATION_FILE__DEPENDENT_CONFIGURATIONS:
				getDependentConfigurations().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_CONFIGURATION_FILE__DEPENDENT_CONFIGURATIONS:
				return dependentConfigurations != null && !dependentConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISConfigurationFileImpl
