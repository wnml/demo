/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : dlconf

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2014-08-27 21:28:13
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `productId` bigint(22) NOT NULL AUTO_INCREMENT,
  `sortId` int(11) NOT NULL,
  `name` varchar(80) CHARACTER SET utf8 NOT NULL,
  `basePrice` decimal(12,2) DEFAULT NULL,
  `description` text CHARACTER SET utf8,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '1003', '飞利浦（PHILIPS） 48PFL5445/T3 48英寸 全高清LED智能电视（黑色）', '2999.11', '合资品牌超热销型号！飞利浦48英寸智能电视，超薄窄边+玻璃底座，源自欧洲，彰显贵族品味！30天价保，热线400-656-1000！');
INSERT INTO `product` VALUES ('2', '1003', '啊啊啊啊啊啊 啊啊啊 啊啊啊啊啊 啊啊啊啊啊 啊啊', '2999.00', null);
INSERT INTO `product` VALUES ('3', '1004', '事实上事实上事实上事实上事实上事实上事实上', '2999.00', null);
INSERT INTO `product` VALUES ('4', '1004', '的的的的的的的的的的的的的的的的的的的的的的', '2999.00', null);
INSERT INTO `product` VALUES ('5', '1005', '特特特特特特特特特特特特特特特特特特特特特特特特', '2999.00', '');
INSERT INTO `product` VALUES ('6', '1005', '测试的测试的测试的测试的测试的测试的测试的测试的', '2999.00', null);
INSERT INTO `product` VALUES ('7', '1006', '原理原理原理原理原理原理原理原理原理原理原理', '2999.00', null);
INSERT INTO `product` VALUES ('8', '1006', '哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈', '2999.00', null);
INSERT INTO `product` VALUES ('9', '1007', '当前的饿啊当前的饿啊当前的饿啊当前的饿啊当前的饿啊', '2999.00', null);
INSERT INTO `product` VALUES ('10', '1007', '辛苦啊啊 的辛苦啊啊 的辛苦啊啊 的辛苦啊啊 的辛苦啊啊 的', '2999.00', null);
INSERT INTO `product` VALUES ('11', '1008', '长虹彩电啊长虹彩电啊长虹彩电啊长虹彩电啊长虹彩电啊', '2555.11', null);
INSERT INTO `product` VALUES ('12', '1008', '康佳彩电啊康佳彩电啊康佳彩电啊康佳彩电啊康佳彩电啊', '3000.00', null);
INSERT INTO `product` VALUES ('13', '1009', '索尼彩电啊索尼彩电啊索尼彩电啊索尼彩电啊索尼彩电啊', '2888.00', null);
INSERT INTO `product` VALUES ('14', '1010', '海尔彩电啊海尔彩电啊海尔彩电啊海尔彩电啊海尔彩电啊', '3999.00', null);
INSERT INTO `product` VALUES ('15', '1010', '乐视彩电啊乐视彩电啊乐视彩电啊乐视彩电啊乐视彩电啊', '4999.00', null);
INSERT INTO `product` VALUES ('16', '1011', '格力冰箱啊格力冰箱啊格力冰箱啊格力冰箱啊格力冰箱啊', '3555.00', null);
INSERT INTO `product` VALUES ('17', '1011', '美的空调啊美的空调啊美的空调啊美的空调啊美的空调啊', '2888.00', null);
INSERT INTO `product` VALUES ('18', '1012', '美的电扇啊美的电扇啊美的电扇啊美的电扇啊美的电扇啊', '567.00', null);
INSERT INTO `product` VALUES ('19', '1009', '武昌啊武昌啊武昌啊武昌啊武昌啊武昌啊武昌啊武昌啊', '2222.00', null);
INSERT INTO `product` VALUES ('20', '1012', '汉口啊啊汉口啊啊汉口啊啊汉口啊啊汉口啊啊汉口啊啊', '9898.00', null);
