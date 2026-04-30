/**
 */
package edu.kit.ipd.sdq.kamp4is.model.modificationmarks;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifySignature#getIsmodifyoperationtiming <em>Ismodifyoperationtiming</em>}</li>
 * </ul>
 *
 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature()
 * @model
 * @generated
 */
public interface ISModifySignature extends ISModifyEntity<Signature> {

	/**
	 * Returns the value of the '<em><b>Ismodifyoperationtiming</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModifyOperationTiming}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismodifyoperationtiming</em>' containment reference list.
	 * @see edu.kit.ipd.sdq.kamp4is.model.modificationmarks.ISModificationmarksPackage#getISModifySignature_Ismodifyoperationtiming()
	 * @model containment="true"
	 * @generated
	 */
	EList<ISModifyOperationTiming> getIsmodifyoperationtiming();
} // ISModifySignature
