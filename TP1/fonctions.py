def puissance(a, b):
	if not isinstance(a, int):
		raise TypeError("Only integers are allowed for 'a'")
	if not isinstance(b, int):
		raise TypeError("Only integers are allowed for 'b'")

# Cas spécial : exposant nul
	if b == 0:
		return 1

# Cas d'exposant négatif
	if b < 0:
		if a == 0:
			raise ZeroDivisionError("0 cannot be raised to a negative power")
		result = 1
		for _ in range(-b):
			result *= a
		return 1 / result

	# Cas général (exposant positif)
	result = 1
	for _ in range(b):
		result *= a
	return result

