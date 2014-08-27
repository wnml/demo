/*
Navicat MySQL Data Transfer

Source Server         : 本地mysql
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : dlconf

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2014-08-27 21:27:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `sortId` int(11) NOT NULL,
  `parentId` int(11) NOT NULL DEFAULT '0',
  `sortName` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `sortLevel` smallint(6) NOT NULL,
  `description` varchar(256) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`sortId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '0', '图书', '1', '图书啊');
INSERT INTO `category` VALUES ('2', '0', '服饰', '1', '服饰啊');
INSERT INTO `category` VALUES ('3', '0', '家用电器', '1', '家用电器啊');
INSERT INTO `category` VALUES ('4', '0', '数字商品', '1', '数字商品啊');
INSERT INTO `category` VALUES ('1001', '1', '人文社科', '2', '人文社科啊');
INSERT INTO `category` VALUES ('1002', '2', '女装', '2', '女装啊');
INSERT INTO `category` VALUES ('1003', '3', '大家电', '2', '大家电啊');
INSERT INTO `category` VALUES ('1004', '4', '数字音乐', '2', '数字音乐啊');
INSERT INTO `category` VALUES ('1011', '1', '科技', '2', '科技啊');
INSERT INTO `category` VALUES ('10001', '1001', '历史', '3', '历史啊');
INSERT INTO `category` VALUES ('10002', '1002', '连衣裙', '3', '连衣裙啊');
INSERT INTO `category` VALUES ('10003', '1003', '空调', '3', '空调啊');
INSERT INTO `category` VALUES ('10011', '1011', '科普', '3', '科普啊');
INSERT INTO `category` VALUES ('10044', '1004', '古典音乐', '3', '古典音乐啊');
