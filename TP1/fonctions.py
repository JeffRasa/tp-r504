def puissance(a, b):
	if not isinstance(a, int):
		raise TypeError("Seulement INT pour 'a'")
	if not isinstance(b, int):
		raise TypeError("Seulement INT pour 'b'")

	# Cas spécial : a = 0 et b = -1
	if a == 0 and b == -1:
		raise ValueError("Cas indéfini : 0 à la puissance -1")

	# Cas spécial : a = 0 et b = 0
	if a == 0 and b == 0:
		raise ValueError("0 puissance 0 est une forme indéterminée")

	# Cas spécial : exposant nul
	if b == 0:
		return 1

	# Cas d'exposant négatif
	if b < 0:
		if a == 0:
			raise ZeroDivisionError("0 ne peut pas être élevé à une puissance négative")
		result = 1
		for _ in range(-b):
			result *= a
		return 1 / result

	# Cas général (exposant positif)
	result = 1
	for i in range(b):
		result *= a
	return result

