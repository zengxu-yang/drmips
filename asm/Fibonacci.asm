# Compute Fibonacci numbers
	.data
num: .word 6        # the desired index
res: .word 0        # the result 
      .text
      lw $a0, num        # desired index
      li $t0, 1        # current index
      li $t1, 1           # n - 1
      li $t2, 1  	     # n

loop: ble $a0, $t0, end   # found?
      addi $t0, $t0, 1    # increment counter
      move $t3, $t2      # save $t3 temporarily
      add $t2, $t2, $t1
      move $t1, $t3 
      b loop        # repeat if not finished yet.
end:
      sw $t2, res