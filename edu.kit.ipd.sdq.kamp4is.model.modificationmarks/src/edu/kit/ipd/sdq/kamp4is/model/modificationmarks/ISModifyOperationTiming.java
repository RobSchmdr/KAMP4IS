/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import edu.kit.ipd.sdq.kamp.model.modificationmarks.Modification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IS Modify Operation Timing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming#getIsmodifysignature <em>Ismodifysignature</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyOperationTiming()
 * @model
 * @generated
 */
public interface ISModifyOperationTiming extends Modification {
	/**
	 * Returns the value of the '<em><b>Ismodifysignature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismodifysignature</em>' reference.
	 * @see #setIsmodifysignature(ISModifySignature)
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifyOperationTiming_Ismodifysignature()
	 * @model
	 * @generated
	 */
	ISModifySignature getIsmodifysignature();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming#getIsmodifysignature <em>Ismodifysignature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismodifysignature</em>' reference.
	 * @see #getIsmodifysignature()
	 * @generated
	 */
	void setIsmodifysignature(ISModifySignature value);

} // ISModifyOperationTiming
