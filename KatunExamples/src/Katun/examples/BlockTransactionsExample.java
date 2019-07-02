/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katun.examples;

import katun.Block.KatunBlockInfo;

/**
 *
 * @author Valeria-Katun
 */
public class BlockTransactionsExample {

    KatunBlockInfo kbi = new KatunBlockInfo();

    public static long getKatunBlockNumber() {
        KatunBlockInfo kbi = new KatunBlockInfo();
        kbi.getKatunBlockInfo();
        long blockNumber = kbi.blockNumber;
        return blockNumber;
    }

    public static long getKatunBlockHeight() {
        KatunBlockInfo kbi = new KatunBlockInfo();
        kbi.getKatunBlockInfo();
        long blockHeight = kbi.getBlockHeight;
        return blockHeight;
    }

    public static String getKatunBlockCurrentHash() {
        KatunBlockInfo kbi = new KatunBlockInfo();
        kbi.getKatunBlockInfo();
        String blockCurrentHash = kbi.chainCurrentHash;
        return blockCurrentHash;
    }

    public static String getKatunBlockPreviousHash() {
        KatunBlockInfo kbi = new KatunBlockInfo();
        kbi.getKatunBlockInfo();
        String blockPreviousHash = kbi.chainPreviousHash;
        return blockPreviousHash;
    }

    public static String getKatunBlockTransactions() {
        KatunBlockInfo kbi = new KatunBlockInfo();
        String blockTransactions = kbi.getKatunBlockInfoTransactions();
        return blockTransactions;
    }
    
    public static void main(String[] args) throws Exception {
        long katunBlockNumber = getKatunBlockNumber();
        System.out.println("katunBlockNumber:"+katunBlockNumber);
        
        long blockHeight = getKatunBlockHeight();
        System.out.println("blockHeight:" + blockHeight);

        String currentHash = getKatunBlockCurrentHash();
        System.out.println("currentHash:" + currentHash);
        
        String previousHash = getKatunBlockPreviousHash();
        System.out.println("previousHash:" + previousHash);
        
        String blockTransactions = getKatunBlockTransactions();
        System.out.println("blockTransactions:" + blockTransactions);
       
    }
}
