def reverseString(st: str) -> str:
    # Write your code from here.
    a=st.split(" ")
    b=a[::-1]
    c=' '.join([str(i) for i in b])
    return c
