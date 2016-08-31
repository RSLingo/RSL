/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getNameAlias <em>Name Alias</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getActor <em>Actor</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getDescription <em>Description</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.SimpleStep#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getSimpleStep()
 * @model
 * @generated
 */
public interface SimpleStep extends EObject
{
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
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_NameAlias()
   * @model
   * @generated
   */
  String getNameAlias();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getNameAlias <em>Name Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name Alias</em>' attribute.
   * @see #getNameAlias()
   * @generated
   */
  void setNameAlias(String value);

  /**
   * Returns the value of the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' reference.
   * @see #setActor(Actor)
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_Actor()
   * @model
   * @generated
   */
  Actor getActor();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getActor <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' reference.
   * @see #getActor()
   * @generated
   */
  void setActor(Actor value);

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
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Precondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Precondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precondition</em>' attribute.
   * @see #setPrecondition(String)
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_Precondition()
   * @model
   * @generated
   */
  String getPrecondition();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getPrecondition <em>Precondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precondition</em>' attribute.
   * @see #getPrecondition()
   * @generated
   */
  void setPrecondition(String value);

  /**
   * Returns the value of the '<em><b>Postcondition</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postcondition</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postcondition</em>' attribute.
   * @see #setPostcondition(String)
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_Postcondition()
   * @model
   * @generated
   */
  String getPostcondition();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getPostcondition <em>Postcondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcondition</em>' attribute.
   * @see #getPostcondition()
   * @generated
   */
  void setPostcondition(String value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' reference.
   * @see #setNext(Step)
   * @see rslingo.rsl.rsl.RslPackage#getSimpleStep_Next()
   * @model
   * @generated
   */
  Step getNext();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.SimpleStep#getNext <em>Next</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' reference.
   * @see #getNext()
   * @generated
   */
  void setNext(Step value);

} // SimpleStep
