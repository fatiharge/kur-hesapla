package com.fatiharge.mapper;

import com.fatiharge.client.rest.dto.fetchCurrencyPrice.FetchCurrencyPriceResponse;
import com.fatiharge.domain.CurrencyPrice;
import com.fatiharge.dto.findLatestResponse.FindLatestResponse;
import org.mapstruct.*;

@Mapper(componentModel = "cdi")
public interface CurrencyPriceMapper {


    @Mapping(target = "ADA",
            source = "data.ADA.value"
    )
    @Mapping(target = "AED",
            source = "data.AED.value"
    )
    @Mapping(target = "AFN",
            source = "data.AFN.value"
    )
    @Mapping(target = "ALL",
            source = "data.ALL.value"
    )
    @Mapping(target = "AMD",
            source = "data.AMD.value"
    )
    @Mapping(target = "ANG",
            source = "data.ANG.value"
    )
    @Mapping(target = "AOA",
            source = "data.AOA.value"
    )
    @Mapping(target = "ARB",
            source = "data.ARB.value"
    )
    @Mapping(target = "ARS",
            source = "data.ARS.value"
    )
    @Mapping(target = "AUD",
            source = "data.AUD.value"
    )
    @Mapping(target = "AVAX",
            source = "data.AVAX.value"
    )
    @Mapping(target = "AWG",
            source = "data.AWG.value"
    )
    @Mapping(target = "AZN",
            source = "data.AZN.value"
    )
    @Mapping(target = "BAM",
            source = "data.BAM.value"
    )
    @Mapping(target = "BBD",
            source = "data.BBD.value"
    )
    @Mapping(target = "BDT",
            source = "data.BDT.value"
    )
    @Mapping(target = "BGN",
            source = "data.BGN.value"
    )
    @Mapping(target = "BHD",
            source = "data.BHD.value"
    )
    @Mapping(target = "BIF",
            source = "data.BIF.value"
    )
    @Mapping(target = "BMD",
            source = "data.BMD.value"
    )
    @Mapping(target = "BNB",
            source = "data.BNB.value"
    )
    @Mapping(target = "BND",
            source = "data.BND.value"
    )
    @Mapping(target = "BOB",
            source = "data.BOB.value"
    )
    @Mapping(target = "BRL",
            source = "data.BRL.value"
    )
    @Mapping(target = "BSD",
            source = "data.BSD.value"
    )
    @Mapping(target = "BTC",
            source = "data.BTC.value"
    )
    @Mapping(target = "BTN",
            source = "data.BTN.value"
    )
    @Mapping(target = "BWP",
            source = "data.BWP.value"
    )
    @Mapping(target = "BYN",
            source = "data.BYN.value"
    )
    @Mapping(target = "BYR",
            source = "data.BYR.value"
    )
    @Mapping(target = "BZD",
            source = "data.BZD.value"
    )
    @Mapping(target = "CAD",
            source = "data.CAD.value"
    )
    @Mapping(target = "CDF",
            source = "data.CDF.value"
    )
    @Mapping(target = "CHF",
            source = "data.CHF.value"
    )
    @Mapping(target = "CLF",
            source = "data.CLF.value"
    )
    @Mapping(target = "CLP",
            source = "data.CLP.value"
    )
    @Mapping(target = "CNY",
            source = "data.CNY.value"
    )
    @Mapping(target = "COP",
            source = "data.COP.value"
    )
    @Mapping(target = "CRC",
            source = "data.CRC.value"
    )
    @Mapping(target = "CUC",
            source = "data.CUC.value"
    )
    @Mapping(target = "CUP",
            source = "data.CUP.value"
    )
    @Mapping(target = "CVE",
            source = "data.CVE.value"
    )
    @Mapping(target = "CZK",
            source = "data.CZK.value"
    )
    @Mapping(target = "DAI",
            source = "data.DAI.value"
    )
    @Mapping(target = "DJF",
            source = "data.DJF.value"
    )
    @Mapping(target = "DKK",
            source = "data.DKK.value"
    )
    @Mapping(target = "DOP",
            source = "data.DOP.value"
    )
    @Mapping(target = "DOT",
            source = "data.DOT.value"
    )
    @Mapping(target = "DZD",
            source = "data.DZD.value"
    )
    @Mapping(target = "EGP",
            source = "data.EGP.value"
    )
    @Mapping(target = "ERN",
            source = "data.ERN.value"
    )
    @Mapping(target = "ETB",
            source = "data.ETB.value"
    )
    @Mapping(target = "ETH",
            source = "data.ETH.value"
    )
    @Mapping(target = "EUR",
            source = "data.EUR.value"
    )
    @Mapping(target = "FJD",
            source = "data.FJD.value"
    )
    @Mapping(target = "FKP",
            source = "data.FKP.value"
    )
    @Mapping(target = "GBP",
            source = "data.GBP.value"
    )
    @Mapping(target = "GEL",
            source = "data.GEL.value"
    )
    @Mapping(target = "GGP",
            source = "data.GGP.value"
    )
    @Mapping(target = "GHS",
            source = "data.GHS.value"
    )
    @Mapping(target = "GIP",
            source = "data.GIP.value"
    )
    @Mapping(target = "GMD",
            source = "data.GMD.value"
    )
    @Mapping(target = "GNF",
            source = "data.GNF.value"
    )
    @Mapping(target = "GTQ",
            source = "data.GTQ.value"
    )
    @Mapping(target = "GYD",
            source = "data.GYD.value"
    )
    @Mapping(target = "HKD",
            source = "data.HKD.value"
    )
    @Mapping(target = "HNL",
            source = "data.HNL.value"
    )
    @Mapping(target = "HRK",
            source = "data.HRK.value"
    )
    @Mapping(target = "HTG",
            source = "data.HTG.value"
    )
    @Mapping(target = "HUF",
            source = "data.HUF.value"
    )
    @Mapping(target = "IDR",
            source = "data.IDR.value"
    )
    @Mapping(target = "ILS",
            source = "data.ILS.value"
    )
    @Mapping(target = "IMP",
            source = "data.IMP.value"
    )
    @Mapping(target = "INR",
            source = "data.INR.value"
    )
    @Mapping(target = "IQD",
            source = "data.IQD.value"
    )
    @Mapping(target = "IRR",
            source = "data.IRR.value"
    )
    @Mapping(target = "ISK",
            source = "data.ISK.value"
    )
    @Mapping(target = "JEP",
            source = "data.JEP.value"
    )
    @Mapping(target = "JMD",
            source = "data.JMD.value"
    )
    @Mapping(target = "JOD",
            source = "data.JOD.value"
    )
    @Mapping(target = "JPY",
            source = "data.JPY.value"
    )
    @Mapping(target = "KES",
            source = "data.KES.value"
    )
    @Mapping(target = "KGS",
            source = "data.KGS.value"
    )
    @Mapping(target = "KHR",
            source = "data.KHR.value"
    )
    @Mapping(target = "KMF",
            source = "data.KMF.value"
    )
    @Mapping(target = "KPW",
            source = "data.KPW.value"
    )
    @Mapping(target = "KRW",
            source = "data.KRW.value"
    )
    @Mapping(target = "KWD",
            source = "data.KWD.value"
    )
    @Mapping(target = "KYD",
            source = "data.KYD.value"
    )
    @Mapping(target = "KZT",
            source = "data.KZT.value"
    )
    @Mapping(target = "LAK",
            source = "data.LAK.value"
    )
    @Mapping(target = "LBP",
            source = "data.LBP.value"
    )
    @Mapping(target = "LKR",
            source = "data.LKR.value"
    )
    @Mapping(target = "LRD",
            source = "data.LRD.value"
    )
    @Mapping(target = "LSL",
            source = "data.LSL.value"
    )
    @Mapping(target = "LTC",
            source = "data.LTC.value"
    )
    @Mapping(target = "LTL",
            source = "data.LTL.value"
    )
    @Mapping(target = "LVL",
            source = "data.LVL.value"
    )
    @Mapping(target = "LYD",
            source = "data.LYD.value"
    )
    @Mapping(target = "MAD",
            source = "data.MAD.value"
    )
    @Mapping(target = "MATIC",
            source = "data.MATIC.value"
    )
    @Mapping(target = "MDL",
            source = "data.MDL.value"
    )
    @Mapping(target = "MGA",
            source = "data.MGA.value"
    )
    @Mapping(target = "MKD",
            source = "data.MKD.value"
    )
    @Mapping(target = "MMK",
            source = "data.MMK.value"
    )
    @Mapping(target = "MNT",
            source = "data.MNT.value"
    )
    @Mapping(target = "MOP",
            source = "data.MOP.value"
    )
    @Mapping(target = "MRO",
            source = "data.MRO.value"
    )
    @Mapping(target = "MRU",
            source = "data.MRU.value"
    )
    @Mapping(target = "MUR",
            source = "data.MUR.value"
    )
    @Mapping(target = "MVR",
            source = "data.MVR.value"
    )
    @Mapping(target = "MWK",
            source = "data.MWK.value"
    )
    @Mapping(target = "MXN",
            source = "data.MXN.value"
    )
    @Mapping(target = "MYR",
            source = "data.MYR.value"
    )
    @Mapping(target = "MZN",
            source = "data.MZN.value"
    )
    @Mapping(target = "NAD",
            source = "data.NAD.value"
    )
    @Mapping(target = "NGN",
            source = "data.NGN.value"
    )
    @Mapping(target = "NIO",
            source = "data.NIO.value"
    )
    @Mapping(target = "NOK",
            source = "data.NOK.value"
    )
    @Mapping(target = "NPR",
            source = "data.NPR.value"
    )
    @Mapping(target = "NZD",
            source = "data.NZD.value"
    )
    @Mapping(target = "OMR",
            source = "data.OMR.value"
    )
    @Mapping(target = "OP",
            source = "data.OP.value"
    )
    @Mapping(target = "PAB",
            source = "data.PAB.value"
    )
    @Mapping(target = "PEN",
            source = "data.PEN.value"
    )
    @Mapping(target = "PGK",
            source = "data.PGK.value"
    )
    @Mapping(target = "PHP",
            source = "data.PHP.value"
    )
    @Mapping(target = "PKR",
            source = "data.PKR.value"
    )
    @Mapping(target = "PLN",
            source = "data.PLN.value"
    )
    @Mapping(target = "PYG",
            source = "data.PYG.value"
    )
    @Mapping(target = "QAR",
            source = "data.QAR.value"
    )
    @Mapping(target = "RON",
            source = "data.RON.value"
    )
    @Mapping(target = "RSD",
            source = "data.RSD.value"
    )
    @Mapping(target = "RUB",
            source = "data.RUB.value"
    )
    @Mapping(target = "RWF",
            source = "data.RWF.value"
    )
    @Mapping(target = "SAR",
            source = "data.SAR.value"
    )
    @Mapping(target = "SBD",
            source = "data.SBD.value"
    )
    @Mapping(target = "SCR",
            source = "data.SCR.value"
    )
    @Mapping(target = "SDG",
            source = "data.SDG.value"
    )
    @Mapping(target = "SEK",
            source = "data.SEK.value"
    )
    @Mapping(target = "SGD",
            source = "data.SGD.value"
    )
    @Mapping(target = "SHP",
            source = "data.SHP.value"
    )
    @Mapping(target = "SLL",
            source = "data.SLL.value"
    )
    @Mapping(target = "SOL",
            source = "data.SOL.value"
    )
    @Mapping(target = "SOS",
            source = "data.SOS.value"
    )
    @Mapping(target = "SRD",
            source = "data.SRD.value"
    )
    @Mapping(target = "STD",
            source = "data.STD.value"
    )
    @Mapping(target = "STN",
            source = "data.STN.value"
    )
    @Mapping(target = "SVC",
            source = "data.SVC.value"
    )
    @Mapping(target = "SYP",
            source = "data.SYP.value"
    )
    @Mapping(target = "SZL",
            source = "data.SZL.value"
    )
    @Mapping(target = "THB",
            source = "data.THB.value"
    )
    @Mapping(target = "TJS",
            source = "data.TJS.value"
    )
    @Mapping(target = "TMT",
            source = "data.TMT.value"
    )
    @Mapping(target = "TND",
            source = "data.TND.value"
    )
    @Mapping(target = "TOP",
            source = "data.TOP.value"
    )
    @Mapping(target = "TRY",
            source = "data.TRY.value"
    )
    @Mapping(target = "TTD",
            source = "data.TTD.value"
    )
    @Mapping(target = "TWD",
            source = "data.TWD.value"
    )
    @Mapping(target = "TZS",
            source = "data.TZS.value"
    )
    @Mapping(target = "UAH",
            source = "data.UAH.value"
    )
    @Mapping(target = "UGX",
            source = "data.UGX.value"
    )
    @Mapping(target = "USD",
            source = "data.USD.value"
    )
    @Mapping(target = "USDC",
            source = "data.USDC.value"
    )
    @Mapping(target = "USDT",
            source = "data.USDT.value"
    )
    @Mapping(target = "UYU",
            source = "data.UYU.value"
    )
    @Mapping(target = "UZS",
            source = "data.UZS.value"
    )
    @Mapping(target = "VEF",
            source = "data.VEF.value"
    )
    @Mapping(target = "VES",
            source = "data.VES.value"
    )
    @Mapping(target = "VND",
            source = "data.VND.value"
    )
    @Mapping(target = "VUV",
            source = "data.VUV.value"
    )
    @Mapping(target = "WST",
            source = "data.WST.value"
    )
    @Mapping(target = "XAF",
            source = "data.XAF.value"
    )
    @Mapping(target = "XAG",
            source = "data.XAG.value"
    )
    @Mapping(target = "XAU",
            source = "data.XAU.value"
    )
    @Mapping(target = "XCD",
            source = "data.XCD.value"
    )
    @Mapping(target = "XDR",
            source = "data.XDR.value"
    )
    @Mapping(target = "XOF",
            source = "data.XOF.value"
    )
    @Mapping(target = "XPD",
            source = "data.XPD.value"
    )
    @Mapping(target = "XPF",
            source = "data.XPF.value"
    )
    @Mapping(target = "XPT",
            source = "data.XPT.value"
    )
    @Mapping(target = "XRP",
            source = "data.XRP.value"
    )
    @Mapping(target = "YER",
            source = "data.YER.value"
    )
    @Mapping(target = "ZAR",
            source = "data.ZAR.value"
    )
    @Mapping(target = "ZMK",
            source = "data.ZMK.value"
    )
    @Mapping(target = "ZMW",
            source = "data.ZMW.value"
    )
    @Mapping(target = "ZWL",
            source = "data.ZWL.value"
    )
    @Mapping(target = "id",
            ignore = true
    )
    @Mapping(target = "baseCurrency",
            ignore = true
    )
    @Mapping(target = "createdDate",
            ignore = true
    )
    CurrencyPrice currencyPriceFromApiResponse(
            FetchCurrencyPriceResponse fetchCurrencyPriceResponse
    );

    @Mapping(target = "data.ADA",
            source = "ADA"
    )
    @Mapping(target = "data.AED",
            source = "AED"
    )
    @Mapping(target = "data.AFN",
            source = "AFN"
    )
    @Mapping(target = "data.ALL",
            source = "ALL"
    )
    @Mapping(target = "data.AMD",
            source = "AMD"
    )
    @Mapping(target = "data.ANG",
            source = "ANG"
    )
    @Mapping(target = "data.AOA",
            source = "AOA"
    )
    @Mapping(target = "data.ARB",
            source = "ARB"
    )
    @Mapping(target = "data.ARS",
            source = "ARS"
    )
    @Mapping(target = "data.AUD",
            source = "AUD"
    )
    @Mapping(target = "data.AVAX",
            source = "AVAX"
    )
    @Mapping(target = "data.AWG",
            source = "AWG"
    )
    @Mapping(target = "data.AZN",
            source = "AZN"
    )
    @Mapping(target = "data.BAM",
            source = "BAM"
    )
    @Mapping(target = "data.BBD",
            source = "BBD"
    )
    @Mapping(target = "data.BDT",
            source = "BDT"
    )
    @Mapping(target = "data.BGN",
            source = "BGN"
    )
    @Mapping(target = "data.BHD",
            source = "BHD"
    )
    @Mapping(target = "data.BIF",
            source = "BIF"
    )
    @Mapping(target = "data.BMD",
            source = "BMD"
    )
    @Mapping(target = "data.BNB",
            source = "BNB"
    )
    @Mapping(target = "data.BND",
            source = "BND"
    )
    @Mapping(target = "data.BOB",
            source = "BOB"
    )
    @Mapping(target = "data.BRL",
            source = "BRL"
    )
    @Mapping(target = "data.BSD",
            source = "BSD"
    )
    @Mapping(target = "data.BTC",
            source = "BTC"
    )
    @Mapping(target = "data.BTN",
            source = "BTN"
    )
    @Mapping(target = "data.BWP",
            source = "BWP"
    )
    @Mapping(target = "data.BYN",
            source = "BYN"
    )
    @Mapping(target = "data.BYR",
            source = "BYR"
    )
    @Mapping(target = "data.BZD",
            source = "BZD"
    )
    @Mapping(target = "data.CAD",
            source = "CAD"
    )
    @Mapping(target = "data.CDF",
            source = "CDF"
    )
    @Mapping(target = "data.CHF",
            source = "CHF"
    )
    @Mapping(target = "data.CLF",
            source = "CLF"
    )
    @Mapping(target = "data.CLP",
            source = "CLP"
    )
    @Mapping(target = "data.CNY",
            source = "CNY"
    )
    @Mapping(target = "data.COP",
            source = "COP"
    )
    @Mapping(target = "data.CRC",
            source = "CRC"
    )
    @Mapping(target = "data.CUC",
            source = "CUC"
    )
    @Mapping(target = "data.CUP",
            source = "CUP"
    )
    @Mapping(target = "data.CVE",
            source = "CVE"
    )
    @Mapping(target = "data.CZK",
            source = "CZK"
    )
    @Mapping(target = "data.DAI",
            source = "DAI"
    )
    @Mapping(target = "data.DJF",
            source = "DJF"
    )
    @Mapping(target = "data.DKK",
            source = "DKK"
    )
    @Mapping(target = "data.DOP",
            source = "DOP"
    )
    @Mapping(target = "data.DOT",
            source = "DOT"
    )
    @Mapping(target = "data.DZD",
            source = "DZD"
    )
    @Mapping(target = "data.EGP",
            source = "EGP"
    )
    @Mapping(target = "data.ERN",
            source = "ERN"
    )
    @Mapping(target = "data.ETB",
            source = "ETB"
    )
    @Mapping(target = "data.ETH",
            source = "ETH"
    )
    @Mapping(target = "data.EUR",
            source = "EUR"
    )
    @Mapping(target = "data.FJD",
            source = "FJD"
    )
    @Mapping(target = "data.FKP",
            source = "FKP"
    )
    @Mapping(target = "data.GBP",
            source = "GBP"
    )
    @Mapping(target = "data.GEL",
            source = "GEL"
    )
    @Mapping(target = "data.GGP",
            source = "GGP"
    )
    @Mapping(target = "data.GHS",
            source = "GHS"
    )
    @Mapping(target = "data.GIP",
            source = "GIP"
    )
    @Mapping(target = "data.GMD",
            source = "GMD"
    )
    @Mapping(target = "data.GNF",
            source = "GNF"
    )
    @Mapping(target = "data.GTQ",
            source = "GTQ"
    )
    @Mapping(target = "data.GYD",
            source = "GYD"
    )
    @Mapping(target = "data.HKD",
            source = "HKD"
    )
    @Mapping(target = "data.HNL",
            source = "HNL"
    )
    @Mapping(target = "data.HRK",
            source = "HRK"
    )
    @Mapping(target = "data.HTG",
            source = "HTG"
    )
    @Mapping(target = "data.HUF",
            source = "HUF"
    )
    @Mapping(target = "data.IDR",
            source = "IDR"
    )
    @Mapping(target = "data.ILS",
            source = "ILS"
    )
    @Mapping(target = "data.IMP",
            source = "IMP"
    )
    @Mapping(target = "data.INR",
            source = "INR"
    )
    @Mapping(target = "data.IQD",
            source = "IQD"
    )
    @Mapping(target = "data.IRR",
            source = "IRR"
    )
    @Mapping(target = "data.ISK",
            source = "ISK"
    )
    @Mapping(target = "data.JEP",
            source = "JEP"
    )
    @Mapping(target = "data.JMD",
            source = "JMD"
    )
    @Mapping(target = "data.JOD",
            source = "JOD"
    )
    @Mapping(target = "data.JPY",
            source = "JPY"
    )
    @Mapping(target = "data.KES",
            source = "KES"
    )
    @Mapping(target = "data.KGS",
            source = "KGS"
    )
    @Mapping(target = "data.KHR",
            source = "KHR"
    )
    @Mapping(target = "data.KMF",
            source = "KMF"
    )
    @Mapping(target = "data.KPW",
            source = "KPW"
    )
    @Mapping(target = "data.KRW",
            source = "KRW"
    )
    @Mapping(target = "data.KWD",
            source = "KWD"
    )
    @Mapping(target = "data.KYD",
            source = "KYD"
    )
    @Mapping(target = "data.KZT",
            source = "KZT"
    )
    @Mapping(target = "data.LAK",
            source = "LAK"
    )
    @Mapping(target = "data.LBP",
            source = "LBP"
    )
    @Mapping(target = "data.LKR",
            source = "LKR"
    )
    @Mapping(target = "data.LRD",
            source = "LRD"
    )
    @Mapping(target = "data.LSL",
            source = "LSL"
    )
    @Mapping(target = "data.LTC",
            source = "LTC"
    )
    @Mapping(target = "data.LTL",
            source = "LTL"
    )
    @Mapping(target = "data.LVL",
            source = "LVL"
    )
    @Mapping(target = "data.LYD",
            source = "LYD"
    )
    @Mapping(target = "data.MAD",
            source = "MAD"
    )
    @Mapping(target = "data.MATIC",
            source = "MATIC"
    )
    @Mapping(target = "data.MDL",
            source = "MDL"
    )
    @Mapping(target = "data.MGA",
            source = "MGA"
    )
    @Mapping(target = "data.MKD",
            source = "MKD"
    )
    @Mapping(target = "data.MMK",
            source = "MMK"
    )
    @Mapping(target = "data.MNT",
            source = "MNT"
    )
    @Mapping(target = "data.MOP",
            source = "MOP"
    )
    @Mapping(target = "data.MRO",
            source = "MRO"
    )
    @Mapping(target = "data.MRU",
            source = "MRU"
    )
    @Mapping(target = "data.MUR",
            source = "MUR"
    )
    @Mapping(target = "data.MVR",
            source = "MVR"
    )
    @Mapping(target = "data.MWK",
            source = "MWK"
    )
    @Mapping(target = "data.MXN",
            source = "MXN"
    )
    @Mapping(target = "data.MYR",
            source = "MYR"
    )
    @Mapping(target = "data.MZN",
            source = "MZN"
    )
    @Mapping(target = "data.NAD",
            source = "NAD"
    )
    @Mapping(target = "data.NGN",
            source = "NGN"
    )
    @Mapping(target = "data.NIO",
            source = "NIO"
    )
    @Mapping(target = "data.NOK",
            source = "NOK"
    )
    @Mapping(target = "data.NPR",
            source = "NPR"
    )
    @Mapping(target = "data.NZD",
            source = "NZD"
    )
    @Mapping(target = "data.OMR",
            source = "OMR"
    )
    @Mapping(target = "data.OP",
            source = "OP"
    )
    @Mapping(target = "data.PAB",
            source = "PAB"
    )
    @Mapping(target = "data.PEN",
            source = "PEN"
    )
    @Mapping(target = "data.PGK",
            source = "PGK"
    )
    @Mapping(target = "data.PHP",
            source = "PHP"
    )
    @Mapping(target = "data.PKR",
            source = "PKR"
    )
    @Mapping(target = "data.PLN",
            source = "PLN"
    )
    @Mapping(target = "data.PYG",
            source = "PYG"
    )
    @Mapping(target = "data.QAR",
            source = "QAR"
    )
    @Mapping(target = "data.RON",
            source = "RON"
    )
    @Mapping(target = "data.RSD",
            source = "RSD"
    )
    @Mapping(target = "data.RUB",
            source = "RUB"
    )
    @Mapping(target = "data.RWF",
            source = "RWF"
    )
    @Mapping(target = "data.SAR",
            source = "SAR"
    )
    @Mapping(target = "data.SBD",
            source = "SBD"
    )
    @Mapping(target = "data.SCR",
            source = "SCR"
    )
    @Mapping(target = "data.SDG",
            source = "SDG"
    )
    @Mapping(target = "data.SEK",
            source = "SEK"
    )
    @Mapping(target = "data.SGD",
            source = "SGD"
    )
    @Mapping(target = "data.SHP",
            source = "SHP"
    )
    @Mapping(target = "data.SLL",
            source = "SLL"
    )
    @Mapping(target = "data.SOL",
            source = "SOL"
    )
    @Mapping(target = "data.SOS",
            source = "SOS"
    )
    @Mapping(target = "data.SRD",
            source = "SRD"
    )
    @Mapping(target = "data.STD",
            source = "STD"
    )
    @Mapping(target = "data.STN",
            source = "STN"
    )
    @Mapping(target = "data.SVC",
            source = "SVC"
    )
    @Mapping(target = "data.SYP",
            source = "SYP"
    )
    @Mapping(target = "data.SZL",
            source = "SZL"
    )
    @Mapping(target = "data.THB",
            source = "THB"
    )
    @Mapping(target = "data.TJS",
            source = "TJS"
    )
    @Mapping(target = "data.TMT",
            source = "TMT"
    )
    @Mapping(target = "data.TND",
            source = "TND"
    )
    @Mapping(target = "data.TOP",
            source = "TOP"
    )
    @Mapping(target = "data.TRY",
            source = "TRY"
    )
    @Mapping(target = "data.TTD",
            source = "TTD"
    )
    @Mapping(target = "data.TWD",
            source = "TWD"
    )
    @Mapping(target = "data.TZS",
            source = "TZS"
    )
    @Mapping(target = "data.UAH",
            source = "UAH"
    )
    @Mapping(target = "data.UGX",
            source = "UGX"
    )
    @Mapping(target = "data.USD",
            source = "USD"
    )
    @Mapping(target = "data.USDC",
            source = "USDC"
    )
    @Mapping(target = "data.USDT",
            source = "USDT"
    )
    @Mapping(target = "data.UYU",
            source = "UYU"
    )
    @Mapping(target = "data.UZS",
            source = "UZS"
    )
    @Mapping(target = "data.VEF",
            source = "VEF"
    )
    @Mapping(target = "data.VES",
            source = "VES"
    )
    @Mapping(target = "data.VND",
            source = "VND"
    )
    @Mapping(target = "data.VUV",
            source = "VUV"
    )
    @Mapping(target = "data.WST",
            source = "WST"
    )
    @Mapping(target = "data.XAF",
            source = "XAF"
    )
    @Mapping(target = "data.XAG",
            source = "XAG"
    )
    @Mapping(target = "data.XAU",
            source = "XAU"
    )
    @Mapping(target = "data.XCD",
            source = "XCD"
    )
    @Mapping(target = "data.XDR",
            source = "XDR"
    )
    @Mapping(target = "data.XOF",
            source = "XOF"
    )
    @Mapping(target = "data.XPD",
            source = "XPD"
    )
    @Mapping(target = "data.XPF",
            source = "XPF"
    )
    @Mapping(target = "data.XPT",
            source = "XPT"
    )
    @Mapping(target = "data.XRP",
            source = "XRP"
    )
    @Mapping(target = "data.YER",
            source = "YER"
    )
    @Mapping(target = "data.ZAR",
            source = "ZAR"
    )
    @Mapping(target = "data.ZMK",
            source = "ZMK"
    )
    @Mapping(target = "data.ZMW",
            source = "ZMW"
    )
    @Mapping(target = "data.ZWL",
            source = "ZWL"
    )
    @Mapping(target = "meta.createdDate",
            source = "createdDate"
    )
    @Mapping(target = "meta.baseCurrency",
            source = "baseCurrency"
    )
    FindLatestResponse findLatestResponseFromCurrencyPrice(CurrencyPrice currencyPrice);

}
