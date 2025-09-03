def puissance(a, b):
	if not type(a) is int:
		raise TypeError("Only integers are allowed for 'a'")
	if not type(b) is int:
		raise TypeError("Only integers are allowed for 'b'")
	return a ** b

