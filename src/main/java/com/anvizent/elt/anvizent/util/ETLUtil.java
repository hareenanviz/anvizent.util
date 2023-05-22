package com.anvizent.elt.anvizent.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ETLUtil {

	public static String ifInOrElse(String fieldValue, String ifValue, String elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(String fieldValue, Date ifValue, Date elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(String fieldValue, Boolean ifValue, Boolean elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(String fieldValue, Byte ifValue, Byte elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(String fieldValue, Short ifValue, Short elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(String fieldValue, Integer ifValue, Integer elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(String fieldValue, Long ifValue, Long elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(String fieldValue, Float ifValue, Float elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(String fieldValue, Double ifValue, Double elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(String fieldValue, BigDecimal ifValue, BigDecimal elseValue, String... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<String> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Date fieldValue, String ifValue, String elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Date fieldValue, Date ifValue, Date elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Date fieldValue, Boolean ifValue, Boolean elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Date fieldValue, Byte ifValue, Byte elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Date fieldValue, Short ifValue, Short elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Date fieldValue, Integer ifValue, Integer elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Date fieldValue, Long ifValue, Long elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Date fieldValue, Float ifValue, Float elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Date fieldValue, Double ifValue, Double elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Date fieldValue, BigDecimal ifValue, BigDecimal elseValue, Date... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Date> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Boolean fieldValue, String ifValue, String elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Boolean fieldValue, Date ifValue, Date elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Boolean fieldValue, Boolean ifValue, Boolean elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Boolean fieldValue, Byte ifValue, Byte elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Boolean fieldValue, Short ifValue, Short elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Boolean fieldValue, Integer ifValue, Integer elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Boolean fieldValue, Long ifValue, Long elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Boolean fieldValue, Float ifValue, Float elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Boolean fieldValue, Double ifValue, Double elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Boolean fieldValue, BigDecimal ifValue, BigDecimal elseValue, Boolean... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Boolean> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Byte fieldValue, String ifValue, String elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Byte fieldValue, Date ifValue, Date elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Byte fieldValue, Boolean ifValue, Boolean elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Byte fieldValue, Byte ifValue, Byte elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Byte fieldValue, Short ifValue, Short elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Byte fieldValue, Integer ifValue, Integer elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Byte fieldValue, Long ifValue, Long elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Byte fieldValue, Float ifValue, Float elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Byte fieldValue, Double ifValue, Double elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Byte fieldValue, BigDecimal ifValue, BigDecimal elseValue, Byte... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Byte> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Short fieldValue, String ifValue, String elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Short fieldValue, Date ifValue, Date elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Short fieldValue, Boolean ifValue, Boolean elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Short fieldValue, Byte ifValue, Byte elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Short fieldValue, Short ifValue, Short elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Short fieldValue, Integer ifValue, Integer elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Short fieldValue, Long ifValue, Long elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Short fieldValue, Float ifValue, Float elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Short fieldValue, Double ifValue, Double elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Short fieldValue, BigDecimal ifValue, BigDecimal elseValue, Short... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Short> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Integer fieldValue, String ifValue, String elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Integer fieldValue, Date ifValue, Date elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Integer fieldValue, Boolean ifValue, Boolean elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Integer fieldValue, Byte ifValue, Byte elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Integer fieldValue, Short ifValue, Short elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Integer fieldValue, Integer ifValue, Integer elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Integer fieldValue, Long ifValue, Long elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Integer fieldValue, Float ifValue, Float elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Integer fieldValue, Double ifValue, Double elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Integer fieldValue, BigDecimal ifValue, BigDecimal elseValue, Integer... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Integer> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Long fieldValue, String ifValue, String elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Long fieldValue, Date ifValue, Date elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Long fieldValue, Boolean ifValue, Boolean elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Long fieldValue, Byte ifValue, Byte elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Long fieldValue, Short ifValue, Short elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Long fieldValue, Integer ifValue, Integer elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Long fieldValue, Long ifValue, Long elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Long fieldValue, Float ifValue, Float elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Long fieldValue, Double ifValue, Double elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Long fieldValue, BigDecimal ifValue, BigDecimal elseValue, Long... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Long> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Float fieldValue, String ifValue, String elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Float fieldValue, Date ifValue, Date elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Float fieldValue, Boolean ifValue, Boolean elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Float fieldValue, Byte ifValue, Byte elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Float fieldValue, Short ifValue, Short elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Float fieldValue, Integer ifValue, Integer elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Float fieldValue, Long ifValue, Long elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Float fieldValue, Float ifValue, Float elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Float fieldValue, Double ifValue, Double elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Float fieldValue, BigDecimal ifValue, BigDecimal elseValue, Float... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Float> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(Double fieldValue, String ifValue, String elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(Double fieldValue, Date ifValue, Date elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(Double fieldValue, Boolean ifValue, Boolean elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(Double fieldValue, Byte ifValue, Byte elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(Double fieldValue, Short ifValue, Short elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(Double fieldValue, Integer ifValue, Integer elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(Double fieldValue, Long ifValue, Long elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(Double fieldValue, Float ifValue, Float elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(Double fieldValue, Double ifValue, Double elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(Double fieldValue, BigDecimal ifValue, BigDecimal elseValue, Double... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<Double> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static String ifInOrElse(BigDecimal fieldValue, String ifValue, String elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Date ifInOrElse(BigDecimal fieldValue, Date ifValue, Date elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Boolean ifInOrElse(BigDecimal fieldValue, Boolean ifValue, Boolean elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Byte ifInOrElse(BigDecimal fieldValue, Byte ifValue, Byte elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Short ifInOrElse(BigDecimal fieldValue, Short ifValue, Short elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Integer ifInOrElse(BigDecimal fieldValue, Integer ifValue, Integer elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Long ifInOrElse(BigDecimal fieldValue, Long ifValue, Long elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Float ifInOrElse(BigDecimal fieldValue, Float ifValue, Float elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static Double ifInOrElse(BigDecimal fieldValue, Double ifValue, Double elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

	public static BigDecimal ifInOrElse(BigDecimal fieldValue, BigDecimal ifValue, BigDecimal elseValue, BigDecimal... checkIn) {
		if (fieldValue == null || checkIn == null) {
			return null;
		} else {
			List<BigDecimal> data = Arrays.asList(checkIn);
			if (data.contains(fieldValue)) {
				return ifValue;
			} else {
				return elseValue;
			}
		}
	}

}
