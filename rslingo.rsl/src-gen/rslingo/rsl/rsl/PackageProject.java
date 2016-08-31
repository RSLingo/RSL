/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.PackageProject#getProject <em>Project</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageProject#getPackageGlossaries <em>Package Glossaries</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageProject#getPackageStakeholders <em>Package Stakeholders</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageProject#getPackageSystems <em>Package Systems</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.PackageProject#getSystemRelations <em>System Relations</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getPackageProject()
 * @model
 * @generated
 */
public interface PackageProject extends PackageAbstract
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see rslingo.rsl.rsl.RslPackage#getPackageProject_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.PackageProject#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Package Glossaries</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.PackageGlossary}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Glossaries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Glossaries</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageProject_PackageGlossaries()
   * @model containment="true"
   * @generated
   */
  EList<PackageGlossary> getPackageGlossaries();

  /**
   * Returns the value of the '<em><b>Package Stakeholders</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.PackageStakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Stakeholders</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Stakeholders</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageProject_PackageStakeholders()
   * @model containment="true"
   * @generated
   */
  EList<PackageStakeholder> getPackageStakeholders();

  /**
   * Returns the value of the '<em><b>Package Systems</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.PackageSystem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Systems</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Systems</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageProject_PackageSystems()
   * @model containment="true"
   * @generated
   */
  EList<PackageSystem> getPackageSystems();

  /**
   * Returns the value of the '<em><b>System Relations</b></em>' containment reference list.
   * The list contents are of type {@link rslingo.rsl.rsl.SystemRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Relations</em>' containment reference list.
   * @see rslingo.rsl.rsl.RslPackage#getPackageProject_SystemRelations()
   * @model containment="true"
   * @generated
   */
  EList<SystemRelation> getSystemRelations();

} // PackageProject
