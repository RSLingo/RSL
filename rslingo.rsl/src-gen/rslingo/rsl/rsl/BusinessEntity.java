/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getMaster <em>Master</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getDetail <em>Detail</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getReference <em>Reference</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.BusinessEntity#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity()
 * @model
 * @generated
 */
public interface BusinessEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.BusinessEntityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.BusinessEntityType
   * @see #setType(BusinessEntityType)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Type()
   * @model
   * @generated
   */
  BusinessEntityType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.BusinessEntityType
   * @see #getType()
   * @generated
   */
  void setType(BusinessEntityType value);

  /**
   * Returns the value of the '<em><b>Name Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name Alias</em>' attribute.
   * @see #setNameAlias(String)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Master</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Master</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Master</em>' containment reference.
   * @see #setMaster(MasterBEntity)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Master()
   * @model containment="true"
   * @generated
   */
  MasterBEntity getMaster();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getMaster <em>Master</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Master</em>' containment reference.
   * @see #getMaster()
   * @generated
   */
  void setMaster(MasterBEntity value);

  /**
   * Returns the value of the '<em><b>Detail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Detail</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Detail</em>' containment reference.
   * @see #setDetail(DetailBEntity)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Detail()
   * @model containment="true"
   * @generated
   */
  DetailBEntity getDetail();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getDetail <em>Detail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Detail</em>' containment reference.
   * @see #getDetail()
   * @generated
   */
  void setDetail(DetailBEntity value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(ReferenceBEntity)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Reference()
   * @model containment="true"
   * @generated
   */
  ReferenceBEntity getReference();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ReferenceBEntity value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see rslingo.rsl.rsl.RslPackage#getBusinessEntity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.BusinessEntity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // BusinessEntity
