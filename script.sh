#!/bin/bash
name="alice"
age=23
directory=$(pwd)

echo "Name: $name"
echo "age: $age"
echo "Current directory: $directory"

read -p "enter your name:"user_name
echo "hello, $user_name!"


if[$age -gt 18]; then
    echo "Adult"
else
   echo "not adult"

fi






