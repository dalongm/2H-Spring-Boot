/*
 Navicat Premium Data Transfer

 Source Server         : iotserver
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 10.10.4.207:3306
 Source Schema         : dbgirl

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 23/03/2019 21:53:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for girl
-- ----------------------------
DROP TABLE IF EXISTS `girl`;
CREATE TABLE `girl`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) NULL DEFAULT NULL,
  `cup_size` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
