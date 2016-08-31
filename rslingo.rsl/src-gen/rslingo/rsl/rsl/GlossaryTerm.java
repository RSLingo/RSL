/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getName <em>Name</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getRef <em>Ref</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getSynonym <em>Synonym</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getSuper <em>Super</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.GlossaryTerm#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm()
 * @model
 * @generated
 */
public interface GlossaryTerm extends EObject
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
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.TermType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.TermType
   * @see #setType(TermType)
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Type()
   * @model
   * @generated
   */
  TermType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.TermType
   * @see #getType()
   * @generated
   */
  void setType(TermType value);

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
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Acronym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acronym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acronym</em>' attribute.
   * @see #setAcronym(String)
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Acronym()
   * @model
   * @generated
   */
  String getAcronym();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getAcronym <em>Acronym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acronym</em>' attribute.
   * @see #getAcronym()
   * @generated
   */
  void setAcronym(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' containment reference.
   * @see #setRef(RefTermApplication)
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Ref()
   * @model containment="true"
   * @generated
   */
  RefTermApplication getRef();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getRef <em>Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' containment reference.
   * @see #getRef()
   * @generated
   */
  void setRef(RefTermApplication value);

  /**
   * Returns the value of the '<em><b>Synonym</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Synonym</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Synonym</em>' attribute.
   * @see #setSynonym(String)
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Synonym()
   * @model
   * @generated
   */
  String getSynonym();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getSynonym <em>Synonym</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Synonym</em>' attribute.
   * @see #getSynonym()
   * @generated
   */
  void setSynonym(String value);

  /**
   * Returns the value of the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super</em>' reference.
   * @see #setSuper(GlossaryTerm)
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Super()
   * @model
   * @generated
   */
  GlossaryTerm getSuper();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getSuper <em>Super</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super</em>' reference.
   * @see #getSuper()
   * @generated
   */
  void setSuper(GlossaryTerm value);

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
   * @see rslingo.rsl.rsl.RslPackage#getGlossaryTerm_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.GlossaryTerm#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // GlossaryTerm
