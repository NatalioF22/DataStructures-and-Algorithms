#!/bin/bash


# List of folders to create
folders=(
    "Trees"
    "Stacks"
    "Queues"
    "Search Algorithms"
    "Sorting Algorithms"
    # Add more folders as needed
)

# Create each folder and a README.md inside it
for folder in "${folders[@]}"; do
    # Replace spaces with underscores for directory names
    dir_name=$(echo "$folder" | sed 's/ /_/g')

    # Create the directory if it doesn't exist
    if [ ! -d "$dir_name" ]; then
        mkdir "$dir_name"
    fi

    # Create a README.md file inside the directory
    readme_file="$dir_name/README.md"
    if [ ! -f "$readme_file" ]; then
        echo "# $folder" > "$readme_file"
        echo "" >> "$readme_file"
        echo "This folder contains implementations and explanations of $folder." >> "$readme_file"
    fi
done

echo "Repository structure has been set up successfully."
