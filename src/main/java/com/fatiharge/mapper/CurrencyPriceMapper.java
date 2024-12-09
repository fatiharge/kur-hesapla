package com.fatiharge.mapper;

import com.fatiharge.client.rest.dto.fetchCurrencyPrice.FetchCurrencyPriceResponse;
import com.fatiharge.domain.CurrencyPrice;
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
    @Mapping(target = "lastUpdated",
            source = "meta.last_updated_at"
    )
    @Mapping(target = "id",
            ignore = true
    )
    @Mapping(target = "baseCurrency",
            ignore = true
    )
    CurrencyPrice currencyPriceFromApiResponse(
            FetchCurrencyPriceResponse fetchCurrencyPriceResponse
    );

}
