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
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature#isTimingChanged <em>Timing Changed</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature()
 * @model
 * @generated
 */
public interface ISModifySignature extends ISModifyEntity<Signature> {

	/**
	 * Returns the value of the '<em><b>Timing Changed</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Changed</em>' attribute.
	 * @see #setTimingChanged(boolean)
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature_TimingChanged()
	 * @model default="true"
	 * @generated
	 */
	boolean isTimingChanged();

	/**
	 * Sets the value of the '{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature#isTimingChanged <em>Timing Changed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Changed</em>' attribute.
	 * @see #isTimingChanged()
	 * @generated
	 */
	void setTimingChanged(boolean value);
} // ISModifySignature
