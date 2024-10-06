#!/bin/zsh

# Ensure the .gitignore file exists
if [ ! -f .gitignore ]; then
    touch .gitignore
fi

# Check if '/.idea' is already in .gitignore, if not, add it
if ! grep -Fxq "/.idea" .gitignore; then
    echo "/.idea" >> .gitignore
    echo ".idea folder added to .gitignore"
fi

# Add all changes to git, excluding those specified in .gitignore
git add .

# Prompt for a commit message
echo "Enter commit message:"
read COMMIT_MESSAGE

# Commit changes
git commit -m "$COMMIT_MESSAGE"

# Push changes to the remote repository
git push -u origin main

echo "Changes have been committed and pushed successfully."
