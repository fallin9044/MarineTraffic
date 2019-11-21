package com.marine.helper;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 10:28
 * @Description:
 */
public class helper {

//    public int TimeDevition(Data d1, Data d2){
//        Date date1 = new Date(d1.getYear(),d1.getMonth(),d1.getDay(),d1.getHour(),d1.getMinute(),d1.getSecond());
//        Date date2 = new Date(d2.getYear(),d2.getMonth(),d2.getDay(),d2.getHour(),d2.getMinute(),d2.getSecond());
//        String timestamp = String.valueOf((date1.getTime()-date2.getTime())/1000);
//        return Integer.valueOf(timestamp);
//    }
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 10:43 上午 2019/11/15
//         * @Param [slice, divisor]
//         * @return void
//    **/
//    public void SliceDividePrintln(int[] slice, double divisor){
//        for(int i : slice) {
//            System.out.print(String.format("%8.2f", Double.valueOf(String.valueOf(i)) / divisor));
//        }
//        System.out.println();
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 10:46 上午 2019/11/15
//         * @Param [response, lotDivide, lastDivide, day]
//         * @return void
//    **/
//    public void CulTrafficResponsePrint(CulTrafficResponse response, int lotDivide, int latDivide, double day) {
//        System.out.println("=========Traffic=========");
//        System.out.println("Traffic:             " + response.getTrafficData().getTraffic());
//        System.out.println("BigShipTraffic:      " + response.getTrafficData().getBigShipTraffic());
//        System.out.println("SmallShipTraffic:    " + response.getTrafficData().getSmallShipTraffic());
//        System.out.println("SmallShipTraffic:    " + response.getTrafficData().getSmallShipTraffic());
//        System.out.println("Type0ShipTraffic:    " + response.getTrafficData().getType0ShipTraffic());
//        System.out.println("Type6xShipTraffic:   " + response.getTrafficData().getType6xShipTraffic());
//        System.out.println("Type7xShipTraffic:   " + response.getTrafficData().getType7xShipTraffic());
//        System.out.println("Type8xShipTraffic:   " + response.getTrafficData().getType8xShipTraffic());
//        System.out.println("OtherTypeShipTraffic:" + response.getTrafficData().getOtherTypeShipTraffic());
//        System.out.println("=========DayTraffic=========");
//
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j])) / day);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=========DayBigShipTraffic=========");
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j].getBigShipTraffic())) / day);
//            }
//            System.out.println();
//        }
//        System.out.println("=========DayType0ShipTraffic=========");
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j].getType0ShipTraffic())) / day);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=========DayType7xShipTraffic=========");
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j].getType7xShipTraffic())) / day);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=========DayType8xShipTraffic=========");
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j].getType8xShipTraffic())) / day);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=========DayType8xShipTraffic=========");
//        for (int j = latDivide - 1; j >= 0; j--) {
//            for (int i = 0; i < lotDivide; i++) {
//                System.out.format("%8.2f\n", Double.valueOf(String.valueOf(response.getAreaTraffics()[i][j].getOtherTypeShipTraffic())) / day);
//            }
//            System.out.println();
//        }
//
//        System.out.println("=========HourTraffic=========");
//        System.out.println("Hour, Traffic, BigShipTraffic, SmallShipTraffic Type0ShipTraffic Type6xShipTraffic Type7xShipTraffic Type8xShipTraffic OtherTypeShipTraffic");
//
//        for (int i = 0; i < 24; i++) {
//            System.out.format("%2.d: %8.2f%8.2f%8.2f%8.2f%8.2f%8.2f%8.2f%8.2f\n",
//                    i,
//                    Double.valueOf(response.getTrafficData().getHourTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourBigShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourSmallShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourType0ShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourType6xShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourType7xShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourType8xShipTrafficSum()[i]) / day,
//                    Double.valueOf(response.getTrafficData().getHourOtherTypeShipTraffic()[i]) / day
//            );
//        }
//
//        System.out.println("Traffic");
//        for (Integer v : response.getTrafficData().getHourTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("BigShipTraffic");
//        for (Integer v : response.getTrafficData().getHourBigShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("SmallShipTraffic");
//        for (Integer v : response.getTrafficData().getHourSmallShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("Type0ShipTraffic");
//        for (Integer v : response.getTrafficData().getHourType0ShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//
//        System.out.println("Type6xShipTraffic");
//        for (Integer v : response.getTrafficData().getHourType6xShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("Type7xShipTraffic");
//        for (Integer v : response.getTrafficData().getHourType7xShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("Type8xShipTraffic");
//        for (Integer v : response.getTrafficData().getHourType8xShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//
//        System.out.println("Type8xShipTraffic");
//        for (Integer v : response.getTrafficData().getHourType8xShipTrafficSum()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("OtherTypeShipTraffic");
//        for (Integer v : response.getTrafficData().getHourOtherTypeShipTraffic()) {
//            System.out.print(Double.valueOf(v) / day + ",");
//        }
//        System.out.println("");
//
//        System.out.println("=========AreaTraffic=========");
//        System.out.print("");
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 100; j++) {
//                int traffic = response.getAreaTraffics()[i][j].getTraffic();
//                int value = 5;
//                if (traffic > 100 * (new Double(day)).intValue()) {
//                    value = 0;
//                } else if (traffic > 75 * (new Double(day)).intValue()) {
//                    value = 1;
//                } else if (traffic > 50 * (new Double(day)).intValue()) {
//                    value = 2;
//                } else if (traffic > 25 * (new Double(day)).intValue()) {
//                    value = 3;
//                } else if (traffic > 0) {
//                    value = 4;
//                }
//                System.out.print("[" + i + "," + j + "," + value + "],");
//
//            }
//        }
//        System.out.print("]\r\n");
//    }
}
