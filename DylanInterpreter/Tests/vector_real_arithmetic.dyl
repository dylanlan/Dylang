function main() returns integer {
	real vector a[2] = [1.223, 2.36] + [1.424, 2.7111];
	real vector b[2] = [3.5, 4.2] - [1.7, 2.5];
	real vector c[2] = [5.7, 6.5] * [5.1, 6.1];
	real vector d[2] = [10.5, 8.8] / [2.0, 4.1];
	
	print(a + "\n");
	print(b + "\n");
	print(c + "\n");
	print(d + "\n");
	
	return 0;
}
