/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.memorando.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.memorando.Destino;
import org.xtext.example.mydsl.memorando.Memorando;
import org.xtext.example.mydsl.memorando.MemorandoFactory;
import org.xtext.example.mydsl.memorando.MemorandoPackage;
import org.xtext.example.mydsl.memorando.Model;
import org.xtext.example.mydsl.memorando.Paragrafo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MemorandoPackageImpl extends EPackageImpl implements MemorandoPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memorandoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass destinoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paragrafoEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.memorando.MemorandoPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MemorandoPackageImpl()
  {
    super(eNS_URI, MemorandoFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MemorandoPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MemorandoPackage init()
  {
    if (isInited) return (MemorandoPackage)EPackage.Registry.INSTANCE.getEPackage(MemorandoPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredMemorandoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    MemorandoPackageImpl theMemorandoPackage = registeredMemorandoPackage instanceof MemorandoPackageImpl ? (MemorandoPackageImpl)registeredMemorandoPackage : new MemorandoPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theMemorandoPackage.createPackageContents();

    // Initialize created meta-data
    theMemorandoPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMemorandoPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MemorandoPackage.eNS_URI, theMemorandoPackage);
    return theMemorandoPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Memorandos()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMemorando()
  {
    return memorandoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Numero()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_SetorDestinatario()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_SetorRemetente()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Cidade()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Estado()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Dia()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Mes()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Ano()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_CargoDestinatario()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Assunto()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMemorando_Destinos()
  {
    return (EReference)memorandoEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMemorando_Paragrafos()
  {
    return (EReference)memorandoEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_Remetente()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemorando_CargoRemetente()
  {
    return (EAttribute)memorandoEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDestino()
  {
    return destinoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDestino_Destino()
  {
    return (EAttribute)destinoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParagrafo()
  {
    return paragrafoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getParagrafo_Paragrafo()
  {
    return (EAttribute)paragrafoEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemorandoFactory getMemorandoFactory()
  {
    return (MemorandoFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__MEMORANDOS);

    memorandoEClass = createEClass(MEMORANDO);
    createEAttribute(memorandoEClass, MEMORANDO__NUMERO);
    createEAttribute(memorandoEClass, MEMORANDO__SETOR_DESTINATARIO);
    createEAttribute(memorandoEClass, MEMORANDO__SETOR_REMETENTE);
    createEAttribute(memorandoEClass, MEMORANDO__CIDADE);
    createEAttribute(memorandoEClass, MEMORANDO__ESTADO);
    createEAttribute(memorandoEClass, MEMORANDO__DIA);
    createEAttribute(memorandoEClass, MEMORANDO__MES);
    createEAttribute(memorandoEClass, MEMORANDO__ANO);
    createEAttribute(memorandoEClass, MEMORANDO__CARGO_DESTINATARIO);
    createEAttribute(memorandoEClass, MEMORANDO__ASSUNTO);
    createEReference(memorandoEClass, MEMORANDO__DESTINOS);
    createEReference(memorandoEClass, MEMORANDO__PARAGRAFOS);
    createEAttribute(memorandoEClass, MEMORANDO__REMETENTE);
    createEAttribute(memorandoEClass, MEMORANDO__CARGO_REMETENTE);

    destinoEClass = createEClass(DESTINO);
    createEAttribute(destinoEClass, DESTINO__DESTINO);

    paragrafoEClass = createEClass(PARAGRAFO);
    createEAttribute(paragrafoEClass, PARAGRAFO__PARAGRAFO);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Memorandos(), this.getMemorando(), null, "memorandos", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memorandoEClass, Memorando.class, "Memorando", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemorando_Numero(), ecorePackage.getEInt(), "numero", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_SetorDestinatario(), ecorePackage.getEString(), "setorDestinatario", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_SetorRemetente(), ecorePackage.getEString(), "setorRemetente", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Cidade(), ecorePackage.getEString(), "cidade", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Estado(), ecorePackage.getEString(), "estado", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Dia(), ecorePackage.getEInt(), "dia", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Mes(), ecorePackage.getEString(), "mes", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Ano(), ecorePackage.getEInt(), "ano", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_CargoDestinatario(), ecorePackage.getEString(), "cargoDestinatario", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Assunto(), ecorePackage.getEString(), "assunto", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemorando_Destinos(), this.getDestino(), null, "destinos", null, 0, -1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemorando_Paragrafos(), this.getParagrafo(), null, "paragrafos", null, 0, -1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_Remetente(), ecorePackage.getEString(), "remetente", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMemorando_CargoRemetente(), ecorePackage.getEString(), "cargoRemetente", null, 0, 1, Memorando.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(destinoEClass, Destino.class, "Destino", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDestino_Destino(), ecorePackage.getEString(), "destino", null, 0, 1, Destino.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paragrafoEClass, Paragrafo.class, "Paragrafo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParagrafo_Paragrafo(), ecorePackage.getEString(), "paragrafo", null, 0, 1, Paragrafo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MemorandoPackageImpl