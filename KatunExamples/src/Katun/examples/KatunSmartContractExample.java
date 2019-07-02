/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katun.examples;

import katun.smartContract.invokation.SmartContractFuctions;

/**
 *
 * @author Valeria-Katun
 */
public class KatunSmartContractExample {

    public static String[] getDeploySmartContract() {
        SmartContractFuctions scf = new SmartContractFuctions();
        String[] argumentsDeploy = {"smartcontractEvent", "json"};
        String[] responseDeploy = scf.DeployKatChainCode("smartcontractName", argumentsDeploy);
        return responseDeploy;
    }

    public static String[] getInvokeSmartContract() {
        SmartContractFuctions scf = new SmartContractFuctions();
        String[] argumentsInvoke = {"smartcontractEvent", "json"};
        String[] responseDeploy = scf.InvokeKatChainCode("smartcontractName", "functionName", argumentsInvoke);
        return responseDeploy;
    }

    public static String[] getQuerySmartContract() {
        SmartContractFuctions scf = new SmartContractFuctions();
        String[] argumentsQuery = {"transction id (hash)"};
        String[] responseQuery = scf.QueryKatChainCode("smartcontractName", argumentsQuery);
        return responseQuery;
    }

}
