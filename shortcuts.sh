alias compile="bash compiler.sh";
alias one="java -cp \"$(pwd)/build/\" One"
alias two="java -cp \"$(pwd)/build/\" Two"
alias docs="pdflatex -output-directory=\"$(pwd)/docs/\" \"$(pwd)/docs/doc.tex\" && clear && echo Docs were generated";