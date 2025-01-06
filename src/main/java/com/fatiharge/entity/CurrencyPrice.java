package com.fatiharge.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Table(name = "currency_price")
public class CurrencyPrice extends PanacheEntity {
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    @CreationTimestamp
    public Date createdDate;

    @Column(name = "base_currency")
    public String baseCurrency;

    public float ADA;
    public float AED;
    public float AFN;
    @Column(name = "ALL_")
    public float ALL;
    public float AMD;
    public float ANG;
    public float AOA;
    public float ARB;
    public float ARS;
    public float AUD;
    public float AVAX;
    public float AWG;
    public float AZN;
    public float BAM;
    public float BBD;
    public float BDT;
    public float BGN;
    public float BHD;
    public float BIF;
    public float BMD;
    public float BNB;
    public float BND;
    public float BOB;
    public float BRL;
    public float BSD;
    public float BTC;
    public float BTN;
    public float BWP;
    public float BYN;
    public float BYR;
    public float BZD;
    public float CAD;
    public float CDF;
    public float CHF;
    public float CLP;
    public float CNY;
    public float COP;
    public float CRC;
    public float CUC;
    public float CUP;
    public float CVE;
    public float CZK;
    public float DAI;
    public float DJF;
    public float DKK;
    public float DOP;
    public float DOT;
    public float DZD;
    public float EGP;
    public float ERN;
    public float ETB;
    public float ETH;
    public float EUR;
    public float FJD;
    public float FKP;
    public float GBP;
    public float GEL;
    public float GGP;
    public float GHS;
    public float GIP;
    public float GMD;
    public float GNF;
    public float GTQ;
    public float GYD;
    public float HKD;
    public float HNL;
    public float HRK;
    public float HTG;
    public float HUF;
    public float IDR;
    public float ILS;
    public float IMP;
    public float INR;
    public float IQD;
    public float IRR;
    public float ISK;
    public float JEP;
    public float JMD;
    public float JOD;
    public float JPY;
    public float KES;
    public float KGS;
    public float KHR;
    public float KMF;
    public float KPW;
    public float KRW;
    public float KWD;
    public float KYD;
    public float KZT;
    public float LAK;
    public float LBP;
    public float LKR;
    public float LRD;
    public float LSL;
    public float LTC;
    public float LTL;
    public float LVL;
    public float LYD;
    public float MAD;
    public float MATIC;
    public float MDL;
    public float MGA;
    public float MKD;
    public float MMK;
    public float MNT;
    public float MOP;
    public float MRO;
    public float MRU;
    public float MUR;
    public float MVR;
    public float MWK;
    public float MXN;
    public float MYR;
    public float MZN;
    public float NAD;
    public float NGN;
    public float NIO;
    public float NOK;
    public float NPR;
    public float NZD;
    public float OMR;
    public float OP;
    public float PAB;
    public float PEN;
    public float PGK;
    public float PHP;
    public float PKR;
    public float PLN;
    public float PYG;
    public float QAR;
    public float RON;
    public float RSD;
    public float RUB;
    public float RWF;
    public float SAR;
    public float SBD;
    public float SCR;
    public float SDG;
    public float SEK;
    public float SGD;
    public float SHP;
    public float SLL;
    public float SOL;
    public float SOS;
    public float SRD;
    public float STD;
    public float STN;
    public float SVC;
    public float SYP;
    public float SZL;
    public float THB;
    public float TJS;
    public float TMT;
    public float TND;
    public float TOP;
    public float TRY;
    public float TTD;
    public float TWD;
    public float TZS;
    public float UAH;
    public float UGX;
    public float USD;
    public float USDC;
    public float USDT;
    public float UYU;
    public float UZS;
    public float VEF;
    public float VES;
    public float VND;
    public float VUV;
    public float WST;
    public float XAF;
    public float XAG;
    public float XAU;
    public float XCD;
    public float XDR;
    public float XOF;
    public float XPD;
    public float XPF;
    public float XPT;
    public float XRP;
    public float YER;
    public float ZAR;
    public float ZMK;
    public float ZMW;
    public float ZWL;

}
