/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.ChangePropagationStep;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Change Propagation Due To Configuration Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToConfigurationDependencies#getIsmodifyconfiguration <em>Ismodifyconfiguration</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISChangePropagationDueToConfigurationDependencies#getIsmodifycomponent <em>Ismodifycomponent</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToConfigurationDependencies()
 * @model
 * @generated
 */
public interface ISChangePropagationDueToConfigurationDependencies extends ChangePropagationStep {
	/**
	 * Returns the value of the '<em><b>Ismodifyconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismodifyconfiguration</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToConfigurationDependencies_Ismodifyconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyConfiguration> getIsmodifyconfiguration();

	/**
	 * Returns the value of the '<em><b>Ismodifycomponent</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismodifycomponent</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISChangePropagationDueToConfigurationDependencies_Ismodifycomponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyComponent> getIsmodifycomponent();

} // ISChangePropagationDueToConfigurationDependencies
