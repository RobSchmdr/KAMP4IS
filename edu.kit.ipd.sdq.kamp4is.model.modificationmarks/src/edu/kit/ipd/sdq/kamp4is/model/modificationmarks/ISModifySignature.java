/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import org.palladiosimulator.pcm.repository.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Modify Signature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature#getOperationTimingModification <em>Operation Timing Modification</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature()
 * @model
 * @generated
 */
public interface ISModifySignature extends ISModifyEntity<Signature> {

	/**
	 * Returns the value of the '<em><b>Operation Timing Modification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Timing Modification</em>' containment reference.
	 * @see #setOperationTimingModification(ISModifyOperationTiming)
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature_OperationTimingModification()
	 * @model containment="true"
	 * @generated
	 */
	ISModifyOperationTiming getOperationTimingModification();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature#getOperationTimingModification <em>Operation Timing Modification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Timing Modification</em>' containment reference.
	 * @see #getOperationTimingModification()
	 * @generated
	 */
	void setOperationTimingModification(ISModifyOperationTiming value);
} // ISModifySignature
