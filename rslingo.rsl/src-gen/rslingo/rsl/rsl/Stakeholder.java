/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getCategory <em>Category</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getSuper <em>Super</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.Stakeholder#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.StakeholderType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.StakeholderType
   * @see #setType(StakeholderType)
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_Type()
   * @model
   * @generated
   */
  StakeholderType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.StakeholderType
   * @see #getType()
   * @generated
   */
  void setType(StakeholderType value);

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
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.StakeholderCategory}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' attribute.
   * @see rslingo.rsl.rsl.StakeholderCategory
   * @see #setCategory(StakeholderCategory)
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_Category()
   * @model
   * @generated
   */
  StakeholderCategory getCategory();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getCategory <em>Category</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category</em>' attribute.
   * @see rslingo.rsl.rsl.StakeholderCategory
   * @see #getCategory()
   * @generated
   */
  void setCategory(StakeholderCategory value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference.
   * @see #setSuper(Stakeholder)
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_Super()
   * @model
   * @generated
   */
  Stakeholder getSuper();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getSuper <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' reference.
   * @see #getSuper()
   * @generated
   */
  void setSuper(Stakeholder value);

  /**
   * Returns the value of the '<em><b>Part Of</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Of</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Of</em>' reference.
   * @see #setPartOf(Stakeholder)
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_PartOf()
   * @model
   * @generated
   */
  Stakeholder getPartOf();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getPartOf <em>Part Of</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Of</em>' reference.
   * @see #getPartOf()
   * @generated
   */
  void setPartOf(Stakeholder value);

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
   * @see rslingo.rsl.rsl.RslPackage#getStakeholder_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.Stakeholder#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // Stakeholder
