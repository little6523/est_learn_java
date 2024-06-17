package java_0617;

public class ProfileService {
  ProfileRepository profileRepository;

  public void saveProfile(ProfileRepository profileRepository) {
    ProfileDBRepository profileDBRepository = new ProfileDBRepository();
    System.out.println(profileRepository instanceof ProfileRepository);
    profileRepository.save();
  }
}
