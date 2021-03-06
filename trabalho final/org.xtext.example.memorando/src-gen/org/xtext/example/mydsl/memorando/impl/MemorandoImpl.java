/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.memorando.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.memorando.CargoDestinatario;
import org.xtext.example.mydsl.memorando.Memorando;
import org.xtext.example.mydsl.memorando.MemorandoPackage;
import org.xtext.example.mydsl.memorando.Paragrafo;
import org.xtext.example.mydsl.memorando.SetorDestinatario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memorando</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getNumero <em>Numero</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getSetoresDestinatarios <em>Setores Destinatarios</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getSetorRemetente <em>Setor Remetente</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getCidade <em>Cidade</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getEstado <em>Estado</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getDia <em>Dia</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getMes <em>Mes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getAno <em>Ano</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getCargosDestinatarios <em>Cargos Destinatarios</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getAssunto <em>Assunto</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getParagrafos <em>Paragrafos</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getRemetente <em>Remetente</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.memorando.impl.MemorandoImpl#getCargoRemetente <em>Cargo Remetente</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemorandoImpl extends MinimalEObjectImpl.Container implements Memorando
{
  /**
   * The default value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected static final int NUMERO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNumero() <em>Numero</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumero()
   * @generated
   * @ordered
   */
  protected int numero = NUMERO_EDEFAULT;

  /**
   * The cached value of the '{@link #getSetoresDestinatarios() <em>Setores Destinatarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetoresDestinatarios()
   * @generated
   * @ordered
   */
  protected EList<SetorDestinatario> setoresDestinatarios;

  /**
   * The default value of the '{@link #getSetorRemetente() <em>Setor Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetorRemetente()
   * @generated
   * @ordered
   */
  protected static final String SETOR_REMETENTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSetorRemetente() <em>Setor Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetorRemetente()
   * @generated
   * @ordered
   */
  protected String setorRemetente = SETOR_REMETENTE_EDEFAULT;

  /**
   * The default value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCidade()
   * @generated
   * @ordered
   */
  protected static final String CIDADE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCidade() <em>Cidade</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCidade()
   * @generated
   * @ordered
   */
  protected String cidade = CIDADE_EDEFAULT;

  /**
   * The default value of the '{@link #getEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected static final String ESTADO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEstado() <em>Estado</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEstado()
   * @generated
   * @ordered
   */
  protected String estado = ESTADO_EDEFAULT;

  /**
   * The default value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected static final int DIA_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDia() <em>Dia</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDia()
   * @generated
   * @ordered
   */
  protected int dia = DIA_EDEFAULT;

  /**
   * The default value of the '{@link #getMes() <em>Mes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMes()
   * @generated
   * @ordered
   */
  protected static final String MES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMes() <em>Mes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMes()
   * @generated
   * @ordered
   */
  protected String mes = MES_EDEFAULT;

  /**
   * The default value of the '{@link #getAno() <em>Ano</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAno()
   * @generated
   * @ordered
   */
  protected static final int ANO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAno() <em>Ano</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAno()
   * @generated
   * @ordered
   */
  protected int ano = ANO_EDEFAULT;

  /**
   * The cached value of the '{@link #getCargosDestinatarios() <em>Cargos Destinatarios</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargosDestinatarios()
   * @generated
   * @ordered
   */
  protected EList<CargoDestinatario> cargosDestinatarios;

  /**
   * The default value of the '{@link #getAssunto() <em>Assunto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssunto()
   * @generated
   * @ordered
   */
  protected static final String ASSUNTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssunto() <em>Assunto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssunto()
   * @generated
   * @ordered
   */
  protected String assunto = ASSUNTO_EDEFAULT;

  /**
   * The cached value of the '{@link #getParagrafos() <em>Paragrafos</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParagrafos()
   * @generated
   * @ordered
   */
  protected EList<Paragrafo> paragrafos;

  /**
   * The default value of the '{@link #getRemetente() <em>Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemetente()
   * @generated
   * @ordered
   */
  protected static final String REMETENTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemetente() <em>Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemetente()
   * @generated
   * @ordered
   */
  protected String remetente = REMETENTE_EDEFAULT;

  /**
   * The default value of the '{@link #getCargoRemetente() <em>Cargo Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargoRemetente()
   * @generated
   * @ordered
   */
  protected static final String CARGO_REMETENTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCargoRemetente() <em>Cargo Remetente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCargoRemetente()
   * @generated
   * @ordered
   */
  protected String cargoRemetente = CARGO_REMETENTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemorandoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MemorandoPackage.Literals.MEMORANDO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNumero()
  {
    return numero;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNumero(int newNumero)
  {
    int oldNumero = numero;
    numero = newNumero;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__NUMERO, oldNumero, numero));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SetorDestinatario> getSetoresDestinatarios()
  {
    if (setoresDestinatarios == null)
    {
      setoresDestinatarios = new EObjectContainmentEList<SetorDestinatario>(SetorDestinatario.class, this, MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS);
    }
    return setoresDestinatarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSetorRemetente()
  {
    return setorRemetente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSetorRemetente(String newSetorRemetente)
  {
    String oldSetorRemetente = setorRemetente;
    setorRemetente = newSetorRemetente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__SETOR_REMETENTE, oldSetorRemetente, setorRemetente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCidade()
  {
    return cidade;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCidade(String newCidade)
  {
    String oldCidade = cidade;
    cidade = newCidade;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__CIDADE, oldCidade, cidade));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEstado()
  {
    return estado;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEstado(String newEstado)
  {
    String oldEstado = estado;
    estado = newEstado;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__ESTADO, oldEstado, estado));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getDia()
  {
    return dia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDia(int newDia)
  {
    int oldDia = dia;
    dia = newDia;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__DIA, oldDia, dia));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getMes()
  {
    return mes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMes(String newMes)
  {
    String oldMes = mes;
    mes = newMes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__MES, oldMes, mes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getAno()
  {
    return ano;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAno(int newAno)
  {
    int oldAno = ano;
    ano = newAno;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__ANO, oldAno, ano));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CargoDestinatario> getCargosDestinatarios()
  {
    if (cargosDestinatarios == null)
    {
      cargosDestinatarios = new EObjectContainmentEList<CargoDestinatario>(CargoDestinatario.class, this, MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS);
    }
    return cargosDestinatarios;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getAssunto()
  {
    return assunto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssunto(String newAssunto)
  {
    String oldAssunto = assunto;
    assunto = newAssunto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__ASSUNTO, oldAssunto, assunto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Paragrafo> getParagrafos()
  {
    if (paragrafos == null)
    {
      paragrafos = new EObjectContainmentEList<Paragrafo>(Paragrafo.class, this, MemorandoPackage.MEMORANDO__PARAGRAFOS);
    }
    return paragrafos;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRemetente()
  {
    return remetente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRemetente(String newRemetente)
  {
    String oldRemetente = remetente;
    remetente = newRemetente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__REMETENTE, oldRemetente, remetente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCargoRemetente()
  {
    return cargoRemetente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCargoRemetente(String newCargoRemetente)
  {
    String oldCargoRemetente = cargoRemetente;
    cargoRemetente = newCargoRemetente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MemorandoPackage.MEMORANDO__CARGO_REMETENTE, oldCargoRemetente, cargoRemetente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS:
        return ((InternalEList<?>)getSetoresDestinatarios()).basicRemove(otherEnd, msgs);
      case MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS:
        return ((InternalEList<?>)getCargosDestinatarios()).basicRemove(otherEnd, msgs);
      case MemorandoPackage.MEMORANDO__PARAGRAFOS:
        return ((InternalEList<?>)getParagrafos()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MemorandoPackage.MEMORANDO__NUMERO:
        return getNumero();
      case MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS:
        return getSetoresDestinatarios();
      case MemorandoPackage.MEMORANDO__SETOR_REMETENTE:
        return getSetorRemetente();
      case MemorandoPackage.MEMORANDO__CIDADE:
        return getCidade();
      case MemorandoPackage.MEMORANDO__ESTADO:
        return getEstado();
      case MemorandoPackage.MEMORANDO__DIA:
        return getDia();
      case MemorandoPackage.MEMORANDO__MES:
        return getMes();
      case MemorandoPackage.MEMORANDO__ANO:
        return getAno();
      case MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS:
        return getCargosDestinatarios();
      case MemorandoPackage.MEMORANDO__ASSUNTO:
        return getAssunto();
      case MemorandoPackage.MEMORANDO__PARAGRAFOS:
        return getParagrafos();
      case MemorandoPackage.MEMORANDO__REMETENTE:
        return getRemetente();
      case MemorandoPackage.MEMORANDO__CARGO_REMETENTE:
        return getCargoRemetente();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MemorandoPackage.MEMORANDO__NUMERO:
        setNumero((Integer)newValue);
        return;
      case MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS:
        getSetoresDestinatarios().clear();
        getSetoresDestinatarios().addAll((Collection<? extends SetorDestinatario>)newValue);
        return;
      case MemorandoPackage.MEMORANDO__SETOR_REMETENTE:
        setSetorRemetente((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__CIDADE:
        setCidade((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__ESTADO:
        setEstado((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__DIA:
        setDia((Integer)newValue);
        return;
      case MemorandoPackage.MEMORANDO__MES:
        setMes((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__ANO:
        setAno((Integer)newValue);
        return;
      case MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS:
        getCargosDestinatarios().clear();
        getCargosDestinatarios().addAll((Collection<? extends CargoDestinatario>)newValue);
        return;
      case MemorandoPackage.MEMORANDO__ASSUNTO:
        setAssunto((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__PARAGRAFOS:
        getParagrafos().clear();
        getParagrafos().addAll((Collection<? extends Paragrafo>)newValue);
        return;
      case MemorandoPackage.MEMORANDO__REMETENTE:
        setRemetente((String)newValue);
        return;
      case MemorandoPackage.MEMORANDO__CARGO_REMETENTE:
        setCargoRemetente((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MemorandoPackage.MEMORANDO__NUMERO:
        setNumero(NUMERO_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS:
        getSetoresDestinatarios().clear();
        return;
      case MemorandoPackage.MEMORANDO__SETOR_REMETENTE:
        setSetorRemetente(SETOR_REMETENTE_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__CIDADE:
        setCidade(CIDADE_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__ESTADO:
        setEstado(ESTADO_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__DIA:
        setDia(DIA_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__MES:
        setMes(MES_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__ANO:
        setAno(ANO_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS:
        getCargosDestinatarios().clear();
        return;
      case MemorandoPackage.MEMORANDO__ASSUNTO:
        setAssunto(ASSUNTO_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__PARAGRAFOS:
        getParagrafos().clear();
        return;
      case MemorandoPackage.MEMORANDO__REMETENTE:
        setRemetente(REMETENTE_EDEFAULT);
        return;
      case MemorandoPackage.MEMORANDO__CARGO_REMETENTE:
        setCargoRemetente(CARGO_REMETENTE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MemorandoPackage.MEMORANDO__NUMERO:
        return numero != NUMERO_EDEFAULT;
      case MemorandoPackage.MEMORANDO__SETORES_DESTINATARIOS:
        return setoresDestinatarios != null && !setoresDestinatarios.isEmpty();
      case MemorandoPackage.MEMORANDO__SETOR_REMETENTE:
        return SETOR_REMETENTE_EDEFAULT == null ? setorRemetente != null : !SETOR_REMETENTE_EDEFAULT.equals(setorRemetente);
      case MemorandoPackage.MEMORANDO__CIDADE:
        return CIDADE_EDEFAULT == null ? cidade != null : !CIDADE_EDEFAULT.equals(cidade);
      case MemorandoPackage.MEMORANDO__ESTADO:
        return ESTADO_EDEFAULT == null ? estado != null : !ESTADO_EDEFAULT.equals(estado);
      case MemorandoPackage.MEMORANDO__DIA:
        return dia != DIA_EDEFAULT;
      case MemorandoPackage.MEMORANDO__MES:
        return MES_EDEFAULT == null ? mes != null : !MES_EDEFAULT.equals(mes);
      case MemorandoPackage.MEMORANDO__ANO:
        return ano != ANO_EDEFAULT;
      case MemorandoPackage.MEMORANDO__CARGOS_DESTINATARIOS:
        return cargosDestinatarios != null && !cargosDestinatarios.isEmpty();
      case MemorandoPackage.MEMORANDO__ASSUNTO:
        return ASSUNTO_EDEFAULT == null ? assunto != null : !ASSUNTO_EDEFAULT.equals(assunto);
      case MemorandoPackage.MEMORANDO__PARAGRAFOS:
        return paragrafos != null && !paragrafos.isEmpty();
      case MemorandoPackage.MEMORANDO__REMETENTE:
        return REMETENTE_EDEFAULT == null ? remetente != null : !REMETENTE_EDEFAULT.equals(remetente);
      case MemorandoPackage.MEMORANDO__CARGO_REMETENTE:
        return CARGO_REMETENTE_EDEFAULT == null ? cargoRemetente != null : !CARGO_REMETENTE_EDEFAULT.equals(cargoRemetente);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (numero: ");
    result.append(numero);
    result.append(", setorRemetente: ");
    result.append(setorRemetente);
    result.append(", cidade: ");
    result.append(cidade);
    result.append(", estado: ");
    result.append(estado);
    result.append(", dia: ");
    result.append(dia);
    result.append(", mes: ");
    result.append(mes);
    result.append(", ano: ");
    result.append(ano);
    result.append(", assunto: ");
    result.append(assunto);
    result.append(", remetente: ");
    result.append(remetente);
    result.append(", cargoRemetente: ");
    result.append(cargoRemetente);
    result.append(')');
    return result.toString();
  }

} //MemorandoImpl
