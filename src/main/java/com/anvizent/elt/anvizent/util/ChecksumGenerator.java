package com.anvizent.elt.anvizent.util;

import java.math.BigInteger;
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */
public class ChecksumGenerator {
	public static String generate(Object... args) {
		String stringValue = "";
		for (Object object : args) {
			if (!stringValue.isEmpty()) {
				stringValue += ",";
			}

			if (object == null) {
				stringValue += object;
			} else if (object instanceof Date) {
				stringValue += ((Date) object).getTime();
			} else {
				stringValue += "\"" + object + "\"";
			}
		}

		return toString(DigestUtils.md5(stringValue));
	}

	private static String toString(byte[] messageDigest) {
		// Convert byte array into signum representation
		BigInteger no = new BigInteger(1, messageDigest);

		// Convert message digest into hex value
		String hashtext = no.toString(16);

		while (hashtext.length() < 32) {
			hashtext = "0" + hashtext;
		}

		return hashtext;
	}

	public static String generateCaseInsensitive(Object... args) {
		String stringValue = "";
		for (Object object : args) {
			if (!stringValue.isEmpty()) {
				stringValue += ",";
			}

			if (object == null) {
				stringValue += object;
			} else if (object instanceof Date) {
				stringValue += ((Date) object).getTime();
			} else {
				stringValue += ("\"" + object + "\"").toLowerCase();
			}
		}

		return toString(DigestUtils.md5(stringValue));
	}
}
