import pytest
import fonctions as f

def test_1():
	assert f.puissance(2,3) == 8
	assert f.puissance(2,2) == 4

def test_2():
	assert f.puissance(-1,2) == 1
	assert f.puissance(-1,3) == -1
	assert f.puissance(-1,-1) == -1
	assert f.puissance(-1,-2) == 1
	assert f.puissance(-2,-1) == -0.5

def test_3():
# 0^x == 0 pour tout x > 0
	for i in range(1,100):
		assert f.puissance(0, i) == 0

def test_exc_1():
	with pytest.raises(Exception):
		puissance(0,-1)
