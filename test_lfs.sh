#!/usr/bin/bash
TEST_CONFIG="tcp/2022=22
udp/2011=11
2000=20"

for i in $TEST_CONFIG
do
	echo 1
	echo $i
done
