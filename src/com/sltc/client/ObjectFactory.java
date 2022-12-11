
package com.sltc.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateAccountResponse_QNAME = new QName("http://BankService.services.ramesh/", "createAccountResponse");
    private final static QName _TransferMoney_QNAME = new QName("http://BankService.services.ramesh/", "transferMoney");
    private final static QName _WithdrawMoneyResponse_QNAME = new QName("http://BankService.services.ramesh/", "withdrawMoneyResponse");
    private final static QName _CantFindTheAccount_QNAME = new QName("http://BankService.services.ramesh/", "CantFindTheAccount");
    private final static QName _DepositMoneyResponse_QNAME = new QName("http://BankService.services.ramesh/", "depositMoneyResponse");
    private final static QName _GetAccountsResponse_QNAME = new QName("http://BankService.services.ramesh/", "getAccountsResponse");
    private final static QName _DepositMoney_QNAME = new QName("http://BankService.services.ramesh/", "depositMoney");
    private final static QName _InsufficientBalance_QNAME = new QName("http://BankService.services.ramesh/", "InsufficientBalance");
    private final static QName _CreateAccount_QNAME = new QName("http://BankService.services.ramesh/", "createAccount");
    private final static QName _GetAccounts_QNAME = new QName("http://BankService.services.ramesh/", "getAccounts");
    private final static QName _WithdrawMoney_QNAME = new QName("http://BankService.services.ramesh/", "withdrawMoney");
    private final static QName _TransferMoneyResponse_QNAME = new QName("http://BankService.services.ramesh/", "transferMoneyResponse");
    private final static QName _CheckAccountBalanceResponse_QNAME = new QName("http://BankService.services.ramesh/", "checkAccountBalanceResponse");
    private final static QName _InvalidInputValues_QNAME = new QName("http://BankService.services.ramesh/", "InvalidInputValues");
    private final static QName _CheckAccountBalance_QNAME = new QName("http://BankService.services.ramesh/", "checkAccountBalance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateAccountResponse }
     * 
     */
    public CreateAccountResponse createCreateAccountResponse() {
        return new CreateAccountResponse();
    }

    /**
     * Create an instance of {@link TransferMoney }
     * 
     */
    public TransferMoney createTransferMoney() {
        return new TransferMoney();
    }

    /**
     * Create an instance of {@link WithdrawMoneyResponse }
     * 
     */
    public WithdrawMoneyResponse createWithdrawMoneyResponse() {
        return new WithdrawMoneyResponse();
    }

    /**
     * Create an instance of {@link CantFindTheAccount }
     * 
     */
    public CantFindTheAccount createCantFindTheAccount() {
        return new CantFindTheAccount();
    }

    /**
     * Create an instance of {@link DepositMoneyResponse }
     * 
     */
    public DepositMoneyResponse createDepositMoneyResponse() {
        return new DepositMoneyResponse();
    }

    /**
     * Create an instance of {@link GetAccountsResponse }
     * 
     */
    public GetAccountsResponse createGetAccountsResponse() {
        return new GetAccountsResponse();
    }

    /**
     * Create an instance of {@link DepositMoney }
     * 
     */
    public DepositMoney createDepositMoney() {
        return new DepositMoney();
    }

    /**
     * Create an instance of {@link InsufficientBalance }
     * 
     */
    public InsufficientBalance createInsufficientBalance() {
        return new InsufficientBalance();
    }

    /**
     * Create an instance of {@link CreateAccount }
     * 
     */
    public CreateAccount createCreateAccount() {
        return new CreateAccount();
    }

    /**
     * Create an instance of {@link GetAccounts }
     * 
     */
    public GetAccounts createGetAccounts() {
        return new GetAccounts();
    }

    /**
     * Create an instance of {@link WithdrawMoney }
     * 
     */
    public WithdrawMoney createWithdrawMoney() {
        return new WithdrawMoney();
    }

    /**
     * Create an instance of {@link TransferMoneyResponse }
     * 
     */
    public TransferMoneyResponse createTransferMoneyResponse() {
        return new TransferMoneyResponse();
    }

    /**
     * Create an instance of {@link CheckAccountBalanceResponse }
     * 
     */
    public CheckAccountBalanceResponse createCheckAccountBalanceResponse() {
        return new CheckAccountBalanceResponse();
    }

    /**
     * Create an instance of {@link InvalidInputValues }
     * 
     */
    public InvalidInputValues createInvalidInputValues() {
        return new InvalidInputValues();
    }

    /**
     * Create an instance of {@link CheckAccountBalance }
     * 
     */
    public CheckAccountBalance createCheckAccountBalance() {
        return new CheckAccountBalance();
    }

    /**
     * Create an instance of {@link CreateAccountRes }
     * 
     */
    public CreateAccountRes createCreateAccountRes() {
        return new CreateAccountRes();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "createAccountResponse")
    public JAXBElement<CreateAccountResponse> createCreateAccountResponse(CreateAccountResponse value) {
        return new JAXBElement<CreateAccountResponse>(_CreateAccountResponse_QNAME, CreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "transferMoney")
    public JAXBElement<TransferMoney> createTransferMoney(TransferMoney value) {
        return new JAXBElement<TransferMoney>(_TransferMoney_QNAME, TransferMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "withdrawMoneyResponse")
    public JAXBElement<WithdrawMoneyResponse> createWithdrawMoneyResponse(WithdrawMoneyResponse value) {
        return new JAXBElement<WithdrawMoneyResponse>(_WithdrawMoneyResponse_QNAME, WithdrawMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CantFindTheAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "CantFindTheAccount")
    public JAXBElement<CantFindTheAccount> createCantFindTheAccount(CantFindTheAccount value) {
        return new JAXBElement<CantFindTheAccount>(_CantFindTheAccount_QNAME, CantFindTheAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "depositMoneyResponse")
    public JAXBElement<DepositMoneyResponse> createDepositMoneyResponse(DepositMoneyResponse value) {
        return new JAXBElement<DepositMoneyResponse>(_DepositMoneyResponse_QNAME, DepositMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "getAccountsResponse")
    public JAXBElement<GetAccountsResponse> createGetAccountsResponse(GetAccountsResponse value) {
        return new JAXBElement<GetAccountsResponse>(_GetAccountsResponse_QNAME, GetAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "depositMoney")
    public JAXBElement<DepositMoney> createDepositMoney(DepositMoney value) {
        return new JAXBElement<DepositMoney>(_DepositMoney_QNAME, DepositMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsufficientBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "InsufficientBalance")
    public JAXBElement<InsufficientBalance> createInsufficientBalance(InsufficientBalance value) {
        return new JAXBElement<InsufficientBalance>(_InsufficientBalance_QNAME, InsufficientBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "createAccount")
    public JAXBElement<CreateAccount> createCreateAccount(CreateAccount value) {
        return new JAXBElement<CreateAccount>(_CreateAccount_QNAME, CreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "getAccounts")
    public JAXBElement<GetAccounts> createGetAccounts(GetAccounts value) {
        return new JAXBElement<GetAccounts>(_GetAccounts_QNAME, GetAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WithdrawMoney }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "withdrawMoney")
    public JAXBElement<WithdrawMoney> createWithdrawMoney(WithdrawMoney value) {
        return new JAXBElement<WithdrawMoney>(_WithdrawMoney_QNAME, WithdrawMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferMoneyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "transferMoneyResponse")
    public JAXBElement<TransferMoneyResponse> createTransferMoneyResponse(TransferMoneyResponse value) {
        return new JAXBElement<TransferMoneyResponse>(_TransferMoneyResponse_QNAME, TransferMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccountBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "checkAccountBalanceResponse")
    public JAXBElement<CheckAccountBalanceResponse> createCheckAccountBalanceResponse(CheckAccountBalanceResponse value) {
        return new JAXBElement<CheckAccountBalanceResponse>(_CheckAccountBalanceResponse_QNAME, CheckAccountBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidInputValues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "InvalidInputValues")
    public JAXBElement<InvalidInputValues> createInvalidInputValues(InvalidInputValues value) {
        return new JAXBElement<InvalidInputValues>(_InvalidInputValues_QNAME, InvalidInputValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckAccountBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.services.ramesh/", name = "checkAccountBalance")
    public JAXBElement<CheckAccountBalance> createCheckAccountBalance(CheckAccountBalance value) {
        return new JAXBElement<CheckAccountBalance>(_CheckAccountBalance_QNAME, CheckAccountBalance.class, null, value);
    }

}
