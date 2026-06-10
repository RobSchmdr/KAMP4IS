/**
 */
package edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl;

import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISBusDeployment;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISDeploymentSpecification;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISEcuDeployment;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsPackage;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISFieldOfActivityAnnotationsRepository;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstance;
import edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.ISRuntimeInstanceAggregation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IS Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl#getRuntimeInstances <em>Runtime Instances</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl#getRuntimeInstanceAggregations <em>Runtime Instance Aggregations</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl#getEcuDeployments <em>Ecu Deployments</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.kamp4is.model.fieldofactivityannotations.impl.ISDeploymentSpecificationImpl#getBusDeployments <em>Bus Deployments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISDeploymentSpecificationImpl extends EObjectImpl implements ISDeploymentSpecification {
	/**
	 * The cached value of the '{@link #getRuntimeInstances() <em>Runtime Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ISRuntimeInstance> runtimeInstances;

	/**
	 * The cached value of the '{@link #getRuntimeInstanceAggregations() <em>Runtime Instance Aggregations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeInstanceAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<ISRuntimeInstanceAggregation> runtimeInstanceAggregations;

	/**
	 * The cached value of the '{@link #getEcuDeployments() <em>Ecu Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcuDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<ISEcuDeployment> ecuDeployments;

	/**
	 * The cached value of the '{@link #getBusDeployments() <em>Bus Deployments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusDeployments()
	 * @generated
	 * @ordered
	 */
	protected EList<ISBusDeployment> busDeployments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISDeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ISFieldOfActivityAnnotationsPackage.Literals.IS_DEPLOYMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISRuntimeInstance> getRuntimeInstances() {
		if (runtimeInstances == null) {
			runtimeInstances = new EObjectContainmentWithInverseEList<ISRuntimeInstance>(ISRuntimeInstance.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES, ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE__PARENT);
		}
		return runtimeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISRuntimeInstanceAggregation> getRuntimeInstanceAggregations() {
		if (runtimeInstanceAggregations == null) {
			runtimeInstanceAggregations = new EObjectContainmentWithInverseEList<ISRuntimeInstanceAggregation>(ISRuntimeInstanceAggregation.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS, ISFieldOfActivityAnnotationsPackage.IS_RUNTIME_INSTANCE_AGGREGATION__PARENT);
		}
		return runtimeInstanceAggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISFieldOfActivityAnnotationsRepository getParent() {
		if (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT) return null;
		return (ISFieldOfActivityAnnotationsRepository)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ISFieldOfActivityAnnotationsRepository newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(ISFieldOfActivityAnnotationsRepository newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISEcuDeployment> getEcuDeployments() {
		if (ecuDeployments == null) {
			ecuDeployments = new EObjectContainmentWithInverseEList<ISEcuDeployment>(ISEcuDeployment.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS, ISFieldOfActivityAnnotationsPackage.IS_ECU_DEPLOYMENT__PARENT);
		}
		return ecuDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ISBusDeployment> getBusDeployments() {
		if (busDeployments == null) {
			busDeployments = new EObjectContainmentWithInverseEList<ISBusDeployment>(ISBusDeployment.class, this, ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS, ISFieldOfActivityAnnotationsPackage.IS_BUS_DEPLOYMENT__PARENT);
		}
		return busDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeInstances()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeInstanceAggregations()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ISFieldOfActivityAnnotationsRepository)otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEcuDeployments()).basicAdd(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBusDeployments()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return ((InternalEList<?>)getRuntimeInstances()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return ((InternalEList<?>)getRuntimeInstanceAggregations()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				return basicSetParent(null, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				return ((InternalEList<?>)getEcuDeployments()).basicRemove(otherEnd, msgs);
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				return ((InternalEList<?>)getBusDeployments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				return eInternalContainer().eInverseRemove(this, ISFieldOfActivityAnnotationsPackage.IS_FIELD_OF_ACTIVITY_ANNOTATIONS_REPOSITORY__DEPLOYMENT_SPECIFICATION, ISFieldOfActivityAnnotationsRepository.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return getRuntimeInstances();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return getRuntimeInstanceAggregations();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				return getParent();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				return getEcuDeployments();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				return getBusDeployments();
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				getRuntimeInstances().addAll((Collection<? extends ISRuntimeInstance>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				getRuntimeInstanceAggregations().addAll((Collection<? extends ISRuntimeInstanceAggregation>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				getEcuDeployments().clear();
				getEcuDeployments().addAll((Collection<? extends ISEcuDeployment>)newValue);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				getBusDeployments().clear();
				getBusDeployments().addAll((Collection<? extends ISBusDeployment>)newValue);
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				getRuntimeInstances().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				getRuntimeInstanceAggregations().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				setParent((ISFieldOfActivityAnnotationsRepository)null);
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				getEcuDeployments().clear();
				return;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				getBusDeployments().clear();
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
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCES:
				return runtimeInstances != null && !runtimeInstances.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__RUNTIME_INSTANCE_AGGREGATIONS:
				return runtimeInstanceAggregations != null && !runtimeInstanceAggregations.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__PARENT:
				return getParent() != null;
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__ECU_DEPLOYMENTS:
				return ecuDeployments != null && !ecuDeployments.isEmpty();
			case ISFieldOfActivityAnnotationsPackage.IS_DEPLOYMENT_SPECIFICATION__BUS_DEPLOYMENTS:
				return busDeployments != null && !busDeployments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISDeploymentSpecificationImpl
