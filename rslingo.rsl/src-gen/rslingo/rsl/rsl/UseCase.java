/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getType <em>Type</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getActorInitiates <em>Actor Initiates</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getActorParticipates <em>Actor Participates</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getBEntity <em>BEntity</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getActions <em>Actions</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getExtensionPoints <em>Extension Points</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getIncludes <em>Includes</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getExtends <em>Extends</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.UseCase#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getUseCase()
 * @model
 * @generated
 */
public interface UseCase extends Requirement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link rslingo.rsl.rsl.UseCaseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.UseCaseType
   * @see #setType(UseCaseType)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Type()
   * @model
   * @generated
   */
  UseCaseType getType();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see rslingo.rsl.rsl.UseCaseType
   * @see #getType()
   * @generated
   */
  void setType(UseCaseType value);

  /**
   * Returns the value of the '<em><b>Actor Initiates</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Initiates</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor Initiates</em>' reference.
   * @see #setActorInitiates(Actor)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_ActorInitiates()
   * @model
   * @generated
   */
  Actor getActorInitiates();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getActorInitiates <em>Actor Initiates</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor Initiates</em>' reference.
   * @see #getActorInitiates()
   * @generated
   */
  void setActorInitiates(Actor value);

  /**
   * Returns the value of the '<em><b>Actor Participates</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.RefActor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Participates</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor Participates</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_ActorParticipates()
   * @model containment="true"
   * @generated
   */
  EList<RefActor> getActorParticipates();

  /**
   * Returns the value of the '<em><b>BEntity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>BEntity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>BEntity</em>' reference.
   * @see #setBEntity(BusinessEntity)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_BEntity()
   * @model
   * @generated
   */
  BusinessEntity getBEntity();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getBEntity <em>BEntity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BEntity</em>' reference.
   * @see #getBEntity()
   * @generated
   */
  void setBEntity(BusinessEntity value);

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
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Precondition()
   * @model
   * @generated
   */
  String getPrecondition();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getPrecondition <em>Precondition</em>}' attribute.
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
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Postcondition()
   * @model
   * @generated
   */
  String getPostcondition();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getPostcondition <em>Postcondition</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcondition</em>' attribute.
   * @see #getPostcondition()
   * @generated
   */
  void setPostcondition(String value);

  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference.
   * @see #setActions(UCActions)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Actions()
   * @model containment="true"
   * @generated
   */
  UCActions getActions();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getActions <em>Actions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions</em>' containment reference.
   * @see #getActions()
   * @generated
   */
  void setActions(UCActions value);

  /**
   * Returns the value of the '<em><b>Extension Points</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extension Points</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extension Points</em>' containment reference.
   * @see #setExtensionPoints(UCExtensionPoints)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_ExtensionPoints()
   * @model containment="true"
   * @generated
   */
  UCExtensionPoints getExtensionPoints();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getExtensionPoints <em>Extension Points</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extension Points</em>' containment reference.
   * @see #getExtensionPoints()
   * @generated
   */
  void setExtensionPoints(UCExtensionPoints value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Includes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' containment reference.
   * @see #setIncludes(UCIncludes)
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Includes()
   * @model containment="true"
   * @generated
   */
  UCIncludes getIncludes();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.UseCase#getIncludes <em>Includes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Includes</em>' containment reference.
   * @see #getIncludes()
   * @generated
   */
  void setIncludes(UCIncludes value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.UCExtends}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Extends()
   * @model containment="true"
   * @generated
   */
  EList<UCExtends> getExtends();

  /**
   * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.Scenario}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scenarios</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scenarios</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getUseCase_Scenarios()
   * @model containment="true"
   * @generated
   */
  EList<Scenario> getScenarios();

} // UseCase
