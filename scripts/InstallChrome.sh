#!/bin/bash
set -ex
wget https://dl.google.com/chrome/mac/stable/GGRO/googlechrome.dmg
sudo open ~/Downloads/googlechrome.dmg
sudo cp -r /Volumes/Google\ Chrome/Google\ Chrome.app /Applications/