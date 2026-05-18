/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks.impl;

import edu.kit.ipd.sdq.kamp4is.model.modificationmarks.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.palladiosimulator.pcm.repository.Role;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISModificationmarksFactoryImpl extends EFactoryImpl implements ISModificationmarksFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ISModificationmarksFactory init() {
		try {
			ISModificationmarksFactory theISModificationmarksFactory = (ISModificationmarksFactory)EPackage.Registry.INSTANCE.getEFactory(ISModificationmarksPackage.eNS_URI);
			if (theISModificationmarksFactory != null) {
				return theISModificationmarksFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ISModificationmarksFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISModificationmarksFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ISModificationmarksPackage.IS_MODIFICATION_REPOSITORY: return createISModificationRepository();
			case ISModificationmarksPackage.IS_SEED_MODIFICATIONS: return createISSeedModifications();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_DATA_DEPENDENCIES: return createISChangePropagationDueToDataDependencies();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_INTERFACE_DEPENDENCIES: return createISChangePropagationDueToInterfaceDependencies();
			case ISModificationmarksPackage.IS_INTERCOMPONENT_PROPAGATION: return createISIntercomponentPropagation();
			case ISModificationmarksPackage.IS_INTRACOMPONENT_PROPAGATION: return createISIntracomponentPropagation();
			case ISModificationmarksPackage.IS_MODIFY_DATA_TYPE: return createISModifyDataType();
			case ISModificationmarksPackage.IS_MODIFY_COMPONENT: return createISModifyComponent();
			case ISModificationmarksPackage.IS_MODIFY_CONNECTOR: return createISModifyConnector();
			case ISModificationmarksPackage.IS_MODIFY_ROLE: return createISModifyRole();
			case ISModificationmarksPackage.IS_MODIFY_PROVIDED_ROLE: return createISModifyProvidedRole();
			case ISModificationmarksPackage.IS_MODIFY_REQUIRED_ROLE: return createISModifyRequiredRole();
			case ISModificationmarksPackage.IS_MODIFY_INTERFACE: return createISModifyInterface();
			case ISModificationmarksPackage.IS_MODIFY_SIGNATURE: return createISModifySignature();
			case ISModificationmarksPackage.IS_MODIFY_OPERATION_TIMING: return createISModifyOperationTiming();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_TIMING_DEPENDENCIES: return createISChangePropagationDueToTimingDependencies();
			case ISModificationmarksPackage.IS_MODIFY_CONFIGURATION: return createISModifyConfiguration();
			case ISModificationmarksPackage.IS_CHANGE_PROPAGATION_DUE_TO_CONFIGURATION_DEPENDENCIES: return createISChangePropagationDueToConfigurationDependencies();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModificationRepository createISModificationRepository() {
		ISModificationRepositoryImpl isModificationRepository = new ISModificationRepositoryImpl();
		return isModificationRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISSeedModifications createISSeedModifications() {
		ISSeedModificationsImpl isSeedModifications = new ISSeedModificationsImpl();
		return isSeedModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISChangePropagationDueToDataDependencies createISChangePropagationDueToDataDependencies() {
		ISChangePropagationDueToDataDependenciesImpl isChangePropagationDueToDataDependencies = new ISChangePropagationDueToDataDependenciesImpl();
		return isChangePropagationDueToDataDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISChangePropagationDueToInterfaceDependencies createISChangePropagationDueToInterfaceDependencies() {
		ISChangePropagationDueToInterfaceDependenciesImpl isChangePropagationDueToInterfaceDependencies = new ISChangePropagationDueToInterfaceDependenciesImpl();
		return isChangePropagationDueToInterfaceDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISIntercomponentPropagation createISIntercomponentPropagation() {
		ISIntercomponentPropagationImpl isIntercomponentPropagation = new ISIntercomponentPropagationImpl();
		return isIntercomponentPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISIntracomponentPropagation createISIntracomponentPropagation() {
		ISIntracomponentPropagationImpl isIntracomponentPropagation = new ISIntracomponentPropagationImpl();
		return isIntracomponentPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyDataType createISModifyDataType() {
		ISModifyDataTypeImpl isModifyDataType = new ISModifyDataTypeImpl();
		return isModifyDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyComponent createISModifyComponent() {
		ISModifyComponentImpl isModifyComponent = new ISModifyComponentImpl();
		return isModifyComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyConnector createISModifyConnector() {
		ISModifyConnectorImpl isModifyConnector = new ISModifyConnectorImpl();
		return isModifyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Role> ISModifyRole<T> createISModifyRole() {
		ISModifyRoleImpl<T> isModifyRole = new ISModifyRoleImpl<T>();
		return isModifyRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyProvidedRole createISModifyProvidedRole() {
		ISModifyProvidedRoleImpl isModifyProvidedRole = new ISModifyProvidedRoleImpl();
		return isModifyProvidedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyRequiredRole createISModifyRequiredRole() {
		ISModifyRequiredRoleImpl isModifyRequiredRole = new ISModifyRequiredRoleImpl();
		return isModifyRequiredRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyInterface createISModifyInterface() {
		ISModifyInterfaceImpl isModifyInterface = new ISModifyInterfaceImpl();
		return isModifyInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifySignature createISModifySignature() {
		ISModifySignatureImpl isModifySignature = new ISModifySignatureImpl();
		return isModifySignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyOperationTiming createISModifyOperationTiming() {
		ISModifyOperationTimingImpl isModifyOperationTiming = new ISModifyOperationTimingImpl();
		return isModifyOperationTiming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISChangePropagationDueToTimingDependencies createISChangePropagationDueToTimingDependencies() {
		ISChangePropagationDueToTimingDependenciesImpl isChangePropagationDueToTimingDependencies = new ISChangePropagationDueToTimingDependenciesImpl();
		return isChangePropagationDueToTimingDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModifyConfiguration createISModifyConfiguration() {
		ISModifyConfigurationImpl isModifyConfiguration = new ISModifyConfigurationImpl();
		return isModifyConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISChangePropagationDueToConfigurationDependencies createISChangePropagationDueToConfigurationDependencies() {
		ISChangePropagationDueToConfigurationDependenciesImpl isChangePropagationDueToConfigurationDependencies = new ISChangePropagationDueToConfigurationDependenciesImpl();
		return isChangePropagationDueToConfigurationDependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISModificationmarksPackage getISModificationmarksPackage() {
		return (ISModificationmarksPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ISModificationmarksPackage getPackage() {
		return ISModificationmarksPackage.eINSTANCE;
	}

} //ISModificationmarksFactoryImpl
