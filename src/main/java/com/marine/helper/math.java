
package com.marine.helper;

/**
 * @Auther: cuishuyang
 * @Date: 2019/11/15 16:08
 * @Description:
 */
//public class math {

//package com.marine.helper;
//
//import com.marine.entity.*;
//
//import java.util.Date;
//import java.util.List;
//
///**
// * @Auther: cuishuyang
// * @Date: 2019/11/15 16:08
// * @Description:
// */
//public class math {
//
//    public static double LongitudeMin = 117.7737; // 经度最小值
//    public static double LongitudeMax = 118.63037; // 经度最大值
//    public static double LatitudeMin = 24.08784;  // 纬度最小值
//    public static double LatitudeMax = 24.691;    // 纬度最大值
//    public static int BigShipLength = 100;       // 大型船舶判断条件
//    public static double HalfNauticalMil = 926;       // 0.5海里
//    public static double NauticalMile = 1852;      // 1海里
//    public static double StaticShip = 0.03;      // 静止船舶判断条件
//
//    /**
//     * @return int
//     * @Author cuishuyang
//     * @Description 最大精度区域
//     * @Date 4:20 下午 2019/11/15
//     * @Param [longitude, lotDivide]
//     **/
//    public int LongitudeArea(double longitude, int lotDivide) {
//        double divideRange = (LongitudeMax - LongitudeMin) / Double.valueOf(lotDivide);
//        double startLongitude = LongitudeMin;
//        double endLongitude = startLongitude + divideRange;
//        for (int area = 0; area < lotDivide; area++) {
//            if (longitude >= startLongitude && longitude <= endLongitude) {
//                return area;
//            }
//            startLongitude = endLongitude;
//            endLongitude = startLongitude + divideRange;
//        }
//        return -1;
//    }
//
//    /**
//     * @return int
//     * @Author cuishuyang
//     * @Description
//     * @Date 7:10 下午 2019/11/15
//     * @Param [latitude, latDivide]
//     **/
//    public int LatitudeArea(double latitude, int latDivide) {
//        double divideRange = (LatitudeMax - LatitudeMin) / Double.valueOf(latDivide);
//        double startLatitude = LatitudeMin;
//        double endLatitude = startLatitude + divideRange;
//        for (int area = 0; area < latDivide; area++) {
//            if (latitude >= startLatitude && latitude <= endLatitude) {
//                return area;
//            }
//            startLatitude = endLatitude;
//            endLatitude = startLatitude + divideRange;
//        }
//        return -1;
//    }
//
//    /**
//     * @return int
//     * @Author cuishuyang
//     * @Description
//     * @Date 7:10 下午 2019/11/15
//     * @Param [sog]
//     **/
//    public int SpeedRange(double sog) {
//        if (sog <= 5) {
//            return 0;
//        } else if (sog <= 10) {
//            return 1;
//        } else if (sog <= 15) {
//            return 2;
//        } else if (sog <= 20) {
//            return 3;
//        }
//        return 4;
//    }
//
//    /**
//     * @return java.lang.Boolean
//     * @Author cuishuyang
//     * @Description
//     * @Date 7:22 下午 2019/11/15
//     * @Param [data1, data2]
//     **/
//    public Boolean DataEqual(Data data1, Data data2) {
//        if (data1 == null || data2 == null) {
//            return false;
//        }
//        return data1.getYear() == data2.getYear()
//                && data1.getMonth() == data2.getMonth()
//                && data1.getDay() == data2.getDay()
//                && data1.getHour() == data2.getHour()
//                && data1.getMinute() == data2.getMinute()
//                && data1.getSecond() == data2.getSecond();
//    }
//
//    /**
//     * @return java.lang.Boolean
//     * @Author cuishuyang
//     * @Description
//     * @Date 7:27 下午 2019/11/15
//     * @Param [data1, data2]
//     **/
//    public Boolean DayEqual(Data data1, Data data2) {
//        if (data1 == null || data2 == null) {
//            return false;
//        }
//        return data1.getYear() == data2.getYear()
//                && data1.getMonth() == data2.getMonth()
//                && data1.getDay() == data2.getDay();
//    }
//
//    /**
//     * @return com.marine.entity.Data
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:24 上午 2019/11/16
//     * @Param [data, delta]
//     **/
//    public Data DayDecrease(Data data, Data delta) {
//        Date basrtime = new Date(data.getYear(), data.getMonth(), data.getDay(), data.getHour(), data.getMinute(), data.getSecond());
//        return data;
//    }
//
//    /**
//     * @return com.marine.entity.Data
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:29 上午 2019/11/16
//     * @Param [data, delta]
//     **/
//    public Data DayIncrease(Data data, Data delta) {
//        Date basrtime = new Date(data.getYear(), data.getMonth(), data.getDay(), data.getHour(), data.getMinute(), data.getSecond());
//        return data;
//    }
//
//    /**
//     * @return java.lang.Boolean
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:29 上午 2019/11/16
//     * @Param [a, b]
//     **/
//    public Boolean DayBigger(Data a, Data b) {
//        return new helper().TimeDevition(a, b) >= 0;
//    }
//
//    /**
//     * @return int
//     * @Author cuishuyang
//     * @Description
//     * @Date 10:36 上午 2019/11/16
//     * @Param [slice]
//     **/
//    public int SliceSum(List<Integer> slice) {
//        return slice.size();
//    }
//
//    /**
//     * @return java.lang.Boolean
//     * @Author cuishuyang
//     * @Description
//     * @Date 10:36 上午 2019/11/16
//     * @Param [a, b, c, d]
//     **/
//    public Boolean IsLineInterSect(Position a, Position b, Position c, Position d) {
//
//        double u = (c.getLongitude() - a.getLongitude()) * (b.getLatitude() - a.getLatitude()) - (b.getLongitude() - a.getLongitude()) * (c.getLatitude() - a.getLatitude());
//        double v = (d.getLongitude() - a.getLongitude()) * (b.getLatitude() - a.getLatitude()) - (b.getLongitude() - a.getLongitude()) * (d.getLatitude() - a.getLatitude());
//        double w = (a.getLongitude() - c.getLongitude()) * (d.getLatitude() - c.getLatitude()) - (d.getLongitude() - c.getLongitude()) * (a.getLatitude() - c.getLatitude());
//        double z = (b.getLongitude() - c.getLongitude()) * (d.getLatitude() - c.getLatitude()) - (d.getLongitude() - c.getLongitude()) * (b.getLatitude() - c.getLatitude());
//        return !(u * v > 0) && !(w * z > 0);
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 10:36 上午 2019/11/16
//     * @Param [a, b]
//     **/
//    public double PositionSpacing(Position a, Position b) {
//        double radius = 6378.137;
//        double rad = Math.PI / 180.0;
//        double lat1 = a.getLatitude() * rad;
//        double lng1 = a.getLongitude() * rad;
//        double lat2 = b.getLatitude() * rad;
//        double lng2 = b.getLongitude() * rad;
//        double theta = lng2 - lng1;
//        double distTheta = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(theta);
//        if (distTheta > 1) {
//            distTheta = 1;
//        }
//        double dist = Math.acos(distTheta);
//        return dist * radius * 1000;
//    }
//
//    /**
//     * @return com.marine.entity.Track
//     * @Author cuishuyang
//     * @Description 插值算法 三次样值
//     * @Date 10:38 上午 2019/11/16
//     * @Param [tracks]
//     **/
//    public Track TrackInterpolation(List<Track> tracks) {
//
//        if (tracks.size() == 0) {
//            return null;
//        } else if (tracks.size() == 1) {
//            return tracks.get(0);
//        }
//        return tracks.get(0);
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:06 上午 2019/11/17
//     * @Param [value]
//     **/
//    public double ArcSin(double value) {
//        return 180 * Math.asin(value) / Math.PI;
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:06 上午 2019/11/17
//     * @Param [value]
//     **/
//    public double ArcCos(double value) {
//        return 180 * Math.acos(value) / Math.PI;
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:06 上午 2019/11/17
//     * @Param [angle]
//     **/
//    public double sin(double angle) {
//        return Math.sin(angle * Math.PI / 180);
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 9:06 上午 2019/11/17
//     * @Param [angle]
//     **/
//    public double cos(double angle) {
//        return Math.cos(angle * Math.PI / 180);
//    }
//
//    /**
//     * @return java.lang.Boolean
//     * @Author cuishuyang
//     * @Description 椭圆上一点到(- S, - T)的距离
//     * @Date 9:06 上午 2019/11/17
//     * @Param [a, b, S, T, x, y, angle]
//     **/
//    public Boolean InEllipse(double a, double b, double S, double T, double x, double y, double angle) {
//        double sin = sin(angle);
//        double cos = cos(angle);
//        double cul = Math.pow(x * sin + y * cos - S, 2) / Math.pow(a, 2) + Math.pow(x * cos - y * sin - T, 2) / Math.pow(b, 2);
//        return cul <= 2;
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description 椭圆上一点到(- S, - T)的距离
//     * @Date 9:11 上午 2019/11/17
//     * @Param [a, b, S, T, x, y, angle]
//     **/
//    public double EllipseR(double a, double b, double S, double T, double angle) {
//
//        double x0 = -S;
//        double y0 = -T;
//        double x = 0.0;
//        double y = 0.0;
//        if (angle == 0 || angle == 360) {
//            x = -S;
//            y = Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            return y + T;
//        } else if (angle == 180) {
//            x = -S;
//            y = Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            return y - T;
//        } else if (angle == 90) {
//            y = -T;
//            x = Math.sqrt((Math.pow(b, 2)) * (1 - (Math.pow(y, 2) / Math.pow(a, 2))));
//            return x + S;
//        } else if (angle == 270) {
//            y = -T;
//            x = Math.sqrt((Math.pow(b, 2)) * (1 - (Math.pow(y, 2) / Math.pow(a, 2))));
//            return x - S;
//        } else if (angle < 180) {
//            double k = cos(angle) / sin(angle);
//            double A = Math.pow(k, 2) + Math.pow(a, 2) / Math.pow(b, 2);
//            double B = 2 * k * (k * S - T);
//            double C = Math.pow(k * S, 2) - 2 * k * T * S + Math.pow(T, 2) - Math.pow(a, 2);
//            x = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
//            if (angle <= 90) {
//                y = Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            } else {
//                y = -Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            }
//        } else {
//            double k = cos(angle) / sin(angle);
//            double A = Math.pow(k, 2) + Math.pow(a, 2) / Math.pow(b, 2);
//            double B = 2 * k * (k * S - T);
//            double C = Math.pow(k * S, 2) - 2 * k * T * S + Math.pow(T, 2) - Math.pow(a, 2);
//            x = (-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A);
//            if (angle > 270) {
//                y = Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            } else {
//                y = -Math.sqrt((Math.pow(a, 2)) * (1 - (Math.pow(x, 2) / Math.pow(b, 2))));
//            }
//        }
//        double length = Math.sqrt(Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
//        return length;
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description 求第二点相对第一点方向
//     * @Date 9:42 上午 2019/11/17
//     * @Param [master, slave]
//     **/
//    public double PositionAzimuth(Position master, Position slave) {
//        double cosc = cos(90 - slave.getLatitude()) * cos(90 - master.getLatitude()) + sin(90 - slave.getLatitude()) * sin(90 - master.getLatitude()) * cos(slave.getLongitude() - master.getLongitude());
//        double sinc = Math.sqrt(1 - Math.pow(cosc, 2));
//        double A = ArcSin((sin(90 - slave.getLatitude()) * sin(slave.getLongitude() - master.getLongitude())) / sinc);
//        if ((sin(90 - slave.getLatitude()) * sin(slave.getLongitude() - master.getLongitude())) / sinc > 1) {
//            A = ArcSin(1);
//        }
//        if (slave.getLongitude() >= master.getLongitude() && slave.getLatitude() >= master.getLatitude()) {
//            return A;
//        } else if (slave.getLongitude() <= master.getLongitude() && slave.getLatitude() >= master.getLatitude()) {
//            return 360 + A;
//        } else {
//            return 180 - A;
//        }
//
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description 求第二点相对带一点速度方向
//     * @Date 9:44 上午 2019/11/17
//     * @Param [master, masterAzimuth, slave]
//     **/
//    public double PositionRelativeAzimuth(Position master, double masterAzimuth, Position slave) {
//        double azimuth = PositionAzimuth(master, slave);
//        double relativeAzimuth = azimuth - masterAzimuth;
//        if (relativeAzimuth < 0) {
//            return relativeAzimuth + 360;
//        }
//        return relativeAzimuth;
//    }
//
//    /**
//     * @return com.marine.entity.MeetingIntersection
//     * @Author cuishuyang
//     * @Description 求最近会遇距离与会遇时间(平面近似 ， 有误差)
//     * @Date 9:57 上午 2019/11/17
//     * @Param [master, slave]
//     **/
//    public MeetingIntersection CulMeetingIntersection(Track master, Track slave) {
//        MeetingIntersection response = new MeetingIntersection();
//        double V0 = master.getSOG();
//        double C0 = master.getCOG();
//        double Vt = slave.getSOG();
//        double Ct = slave.getCOG();
//        double D = PositionSpacing(master.getPrePosition(), slave.getPrePosition());
//        double q = PositionAzimuth(master.getPrePosition(), slave.getPrePosition());
//        double Vr = Math.sqrt(Math.pow(V0, 2) + Math.pow(Vt, 2) - 2 * V0 * Vt * cos(C0 - Ct));
//        double k = Vt / V0;
//        double dH = C0 - Ct;
//        double Cr = ArcCos((1 - k * cos(dH)) / (Math.sqrt(1 - 2 * k * cos(dH) + Math.pow(k, 2))));
//        response.setDCPA(D * sin(Cr - q));
//        response.setTCPA(D * cos(Cr - q) / Vr);
//        response.setVR(Vr);
//        return response;
//    }
//
//    /**
//     * @return com.marine.entity.Position
//     * @Author cuishuyang
//     * @Description 求第二点经纬度
//     * first 第一点位置
//     * L 距离
//     * Azimuth 方位角*
//     * @Date 10:02 上午 2019/11/17
//     * @Param [first, L, Azimuth]
//     **/
//    public Position CulSecondPointPosition(Position first, double L, double Azimuth) {
//        double radius = 6378137;
//        double c = L / radius * 180 / Math.PI;
//        double a = ArcCos(cos(90 - first.getLatitude()) * cos(c) + sin(90 - first.getLatitude()) * sin(c) * cos(Azimuth));
//        double C = ArcSin((sin(c) * sin(Azimuth)) / sin(a));
//        return new Position(90 - a, first.getLongitude() + C);
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 10:40 上午 2019/11/17
//     * @Param [v0, RelativeAzimuth, vt]
//     **/
//    public double PositionRelativeVector(double v0, double RelativeAzimuth, double vt) {
//        double vx = v0 - vt * cos(RelativeAzimuth);
//        double vy = vt * sin(RelativeAzimuth);
//        return Math.sqrt(Math.pow(vx, 2) + Math.pow(vy, 2));
//
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 10:40 上午 2019/11/17
//     * @Param [angle]
//     **/
//    public double BoundaryR(double angle) {
//        return NauticalMile * (1.7 * cos(angle - 19) + Math.sqrt(4.4 + 2.89 * Math.pow(cos(angle - 19), 2)));
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 11:27 上午 2019/11/17
//     * @Param [a, b, S, T, angle, DCPA]
//     **/
//    public double MeetingDangerUDCPA(double a, double b, double S, double T, double angle, double DCPA) {
//        double min = EllipseR(a, b, S, T, angle);
//        //fmt.Println(min)
//        double max = NauticalMile;
//        //fmt.Println(max)
//        if (DCPA < min) {
//            return 1.0;
//        } else if (DCPA > max) {
//            return 0.0;
//        }
//        return 0.5 - Math.sin(Math.PI * (DCPA - (min + max) / 2) / (max - min)) / 2.0;
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 11:31 上午 2019/11/17
//     * @Param [a, b, S, T, angle, DCPA, TCPA, Vr]
//     **/
//    public double MeetingDangerUDCPA(double a, double b, double S, double T, double angle, double DCPA, double TCPA, double Vr) {
//        if (TCPA < 0) {
//            return 0.0;
//        }
//        double max = BoundaryR(angle);
//        double min = 12 * a / 5;
//        double t1 = (DCPA - min) / Vr;
//        if (min >= DCPA) {
//            t1 = Math.sqrt(Math.pow(min, 2) - Math.pow(DCPA, 2)) / Vr;
//        }
//        double t2 = Math.sqrt(Math.pow(max, 2) - Math.pow(DCPA, 2)) / Vr;
//        if (DCPA > max) {
//            return 0.0;
//        }
//        if (TCPA <= t1) {
//            return 1.0;
//        } else if (TCPA > t2) {
//            return 0.0;
//        }
//        return Math.pow((t2 - TCPA) / (t2 - t1), 2);
//    }
//
//    /**
//     * @return double
//     * @Author cuishuyang
//     * @Description
//     * @Date 11:32 上午 2019/11/17
//     * @Param [angle]
//     **/
//    public double MeetingDangerUB(double angle) {
//        return (cos(angle - 19) + Math.sqrt(440.0 / 289.0 + Math.pow(cos(angle - 19), 2))) / 2.0 - 5.0 / 17.0;
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 11:36 上午 2019/11/17
//         * @Param [a, b, S, T, angle, D]
//         * @return double
//    **/
//    public double MeetingDangerUD(double a, double b, double S, double T, double angle, double D){
//        double max = BoundaryR(angle);
//        double min = EllipseR(a, b, S, T, angle);
//        if (D <= min){
//            return 1.0;
//        } else if (D > max){
//            return 0.0;
//        }
//        return Math.pow((max-D)/(max-min), 2);
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 11:39 上午 2019/11/17
//         * @Param [v]
//         * @return double
//    **/
//    public double MeetingDangerUV(double v){
//        double min = StaticShip;
//        double max = 13.7624;
//        if (v < min){
//            return 0;
//        } else if (v > max) {
//            return 1;
//        }
//        return Math.pow((v-min)/(max-min), 2);
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 11:42 上午 2019/11/17
//         * @Param [v0, vt, T]
//         * @return double
//    **/
//    public double MeetingDangerUT(double v0, double vt, double T){
//        double T0 = 90.0;
//        if(v0 > vt){
//            T0 = 180.0;
//        } else if(v0 < vt){
//            T0 = 40.0;
//        }
//        if(T == 360){
//            T = 0;
//        }
//        if(T >= 0 && T < 180){
//            return 1.0 / (1.0 + Math.pow(T/T0, 2));
//        } else if(T >= 180 && T < 360){
//            return 1.0 / Math.pow((360.0-T)/T0, 2);
//        } else {
//            return 0.0;
//        }
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 11:44 上午 2019/11/17
//         * @Param [length, v]
//         * @return double
//    **/
//    public double MaxRate(int length, double v){
//        return 360.0 * v * 1.852 / (2.0 * 3.6 * Math.PI * (length));
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 9:08 上午 2019/11/18
//         * @Param [length, maxSpeed]
//         * @return double
//    **/
//    public double MaxAcceleration(int length, double maxSpeed){
//        maxSpeed = maxSpeed * 1.852 / 3.6;
//        return Math.pow(maxSpeed, 2) / (20*length);
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 9:09 上午 2019/11/18
//         * @Param [length, maxSpeed]
//         * @return double
//    **/
//    public double MinAcceleration(int length, double maxSpeed){
//        maxSpeed = maxSpeed * 1.852 / 3.6;
//        return -1 * Math.pow(maxSpeed, 2) / (16*length);
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 9:13 上午 2019/11/18
//         * @Param [position, prePosition]
//         * @return java.lang.Boolean
//    **/
//    public Boolean movingAvailable(PositionMeta position, PositionMeta prePosition){
//        if (prePosition.getLongitude() == position.getLongitude() &&
//                prePosition.getLatitude() == position.getLatitude() &&
//                prePosition.getSOG() > 2){
//            System.out.println("moving" + prePosition.toString() + position.toString());
//            return false;
//        }
//        return true;
//    }
//
//    /**
//         * @Author cuishuyang
//         * @Description
//         * @Date 9:25 上午 2019/11/18
//         * @Param [position, prePosition]
//         * @return java.lang.Boolean
//    **/
//    public Boolean driftAvailable(PositionMeta position, PositionMeta prePosition){
//        Data data1 = new Data(position.getYear(), position.getMonth(), position.getDay(), position.getHour(), position.getMinute(), position.getSecond());
//        Data data2 = new Data(prePosition.getYear(), prePosition.getMonth(), prePosition.getDay(), prePosition.getHour(), prePosition.getMinute(), prePosition.getSecond());
//        int diff = new helper().TimeDevition(data1, data2);
//        double nowV = prePosition.getSOG() * 1852.0 / 3600.0;
//        return false;
//
//    }

